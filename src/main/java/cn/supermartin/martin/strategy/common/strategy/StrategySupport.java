package cn.supermartin.martin.strategy.common.strategy;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午2:14
 * @description: 所有策略都实现该接口
 */
public interface StrategySupport {


    /**
     * 返回策略的key和版本
     * @return
     */
    StrategyInfo SupportedStrategyInfo();
}
