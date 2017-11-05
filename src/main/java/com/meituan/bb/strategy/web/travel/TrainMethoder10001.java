package com.meituan.bb.strategy.web.travel;

import com.meituan.bb.strategy.common.strategy.StrategyInfo;
import org.springframework.stereotype.Service;

/**
 * @author maxiaoding
 * @date 2017/11/4 下午4:12
 * @description: 使用火车出行的第一个版本
 */
@Service
public class TrainMethoder10001 implements ITravelMethoder {
    @Override
    public StrategyInfo SupportedStrategyInfo() {
        return new StrategyInfo("Train", "10001");
    }

    @Override
    public String getTravelName() {
        return "Train 10001";
    }
}
