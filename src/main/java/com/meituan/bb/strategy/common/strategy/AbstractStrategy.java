package com.meituan.bb.strategy.common.strategy;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午2:29
 * @description:
 */
public abstract class AbstractStrategy<T extends StrategySupport> implements InitializingBean {
    public static final int VERSION_LENGTH = 5;


    /**
     * 某策略下的所有实现
     */
    @Autowired
    private Set<T> strategySupportSet;
    /**
     * 第一个为key，第二个为version
     */
    private Map<String, TreeMap<String, T>> strategySupportMap;

    /**
     * 查找处理类
     *
     * @param key
     * @param version
     * @return
     */
    public T lookup(String key, String version) {
        TreeMap<String, T> versionMap = strategySupportMap.get(key);
        if (versionMap == null || versionMap.size() == 0) {
            return null;
        }
        // 1.如果version为空,默认返回最新版本的
        if (StringUtils.isEmpty(version)) {
            return versionMap.lastEntry().getValue();
        }
        // 2.如果传入版本不符合规则,默认返回null
        if (version.length() != VERSION_LENGTH) {
            return null;
        }
        // 3.查找最精确版本的bean
        T strategy = versionMap.get(version);
        if (strategy != null) {
            return strategy;
        }
        // 6.如果都找不到,返回距离该版本最新的bean
        return versionMap.lastEntry().getValue();
    }


    @Override
    public void afterPropertiesSet() {
        strategySupportMap = new HashMap<>();

        strategySupportSet.stream().forEach(strategy -> {
            StrategyInfo strategyInfo = strategy.SupportedStrategyInfo();
            //获取key所有的版本
            TreeMap<String, T> toSet = Optional.ofNullable(strategySupportMap.get(strategyInfo.getKey())).orElse(new TreeMap<>());
            toSet.put(strategyInfo.getVersion(), strategy);
            strategySupportMap.put(strategyInfo.getKey(), toSet);
        });
    }
}
