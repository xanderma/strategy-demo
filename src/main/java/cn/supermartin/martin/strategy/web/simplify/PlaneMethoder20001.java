package cn.supermartin.martin.strategy.web.simplify;

import cn.supermartin.martin.strategy.common.strategy.StrategyInfo;
import cn.supermartin.martin.strategy.common.strategy.StrategySupport;
import org.springframework.stereotype.Service;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午4:09
 * @description: 使用飞机出行的第一个版本
 */
@Service
public class PlaneMethoder20001 implements StrategySupport {
    /**
     * 返回这个策略的名称和版本
     *
     * @return
     */
    @Override
    public StrategyInfo SupportedStrategyInfo() {
        return new StrategyInfo("Plane", "20001");
    }

    public String getTravelName() {
        return "Plane 20001";
    }
}
