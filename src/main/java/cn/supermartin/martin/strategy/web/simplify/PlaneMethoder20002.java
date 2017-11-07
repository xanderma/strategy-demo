package cn.supermartin.martin.strategy.web.simplify;

import cn.supermartin.martin.strategy.common.strategy.StrategyInfo;
import org.springframework.stereotype.Service;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午4:10
 * @description: 使用飞机出行的第二个版本
 */
@Service
public class PlaneMethoder20002 extends PlaneMethoder20001 {
    @Override
    public StrategyInfo SupportedStrategyInfo() {
        return new StrategyInfo("Plane", "20002");
    }

    @Override
    public String getTravelName() {
        return "Plane 20002";
    }
}
