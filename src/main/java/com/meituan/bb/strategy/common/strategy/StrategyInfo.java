package com.meituan.bb.strategy.common.strategy;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午2:19
 * @description: 策略信息
 */
public class StrategyInfo {
    private String key;
    private String version;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public StrategyInfo(String key, String version) {
        this.key = key;
        this.version = version;
    }
}
