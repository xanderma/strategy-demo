package com.meituan.bb.strategy.web.goods;

import com.meituan.bb.strategy.common.strategy.StrategyInfo;
import com.meituan.bb.strategy.common.strategy.StrategySupport;
import org.springframework.stereotype.Service;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午4:10
 * @description: 使用飞机出行的第二个版本
 */
@Service
public class PlaneMethoder10002 implements ITravelMethoder {
    @Override
    public StrategyInfo SupportedStrategyInfo() {
        return new StrategyInfo("Plane", "10002");
    }

    @Override
    public String getTravelName() {
        return "Plane 10002";
    }
}
