package cn.supermartin.martin.strategy.web.travel;

import cn.supermartin.martin.strategy.common.strategy.StrategyInfo;
import org.springframework.stereotype.Service;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午4:09
 * @description: 使用飞机出行的第一个版本
 */
@Service
public class PlaneMethoder10001 implements ITravelMethoder {
    /**
     * 返回这个策略的名称和版本
     *
     * @return
     */
    @Override
    public StrategyInfo SupportedStrategyInfo() {
        return new StrategyInfo("Plane", "10001");
    }

    @Override
    public String getTravelName() {
        return "Plane 10001";
    }
}
