package cn.supermartin.martin.strategy.web.travel;

import cn.supermartin.martin.strategy.common.strategy.StrategySupport;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午4:20
 * @description: 出行策略的规则
 */
public interface ITravelMethoder extends StrategySupport {
    /**
     * 所有出行方式都需要实现该方法规则
     *
     * @return
     */
    String getTravelName();

}
