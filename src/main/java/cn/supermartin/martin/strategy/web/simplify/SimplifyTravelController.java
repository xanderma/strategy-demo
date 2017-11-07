package cn.supermartin.martin.strategy.web.simplify;

import cn.supermartin.martin.strategy.common.strategy.AbstractStrategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 策略模式的精简用法
 */
@RequestMapping
@RestController
public class SimplifyTravelController extends AbstractStrategy<PlaneMethoder20001> {

    @RequestMapping("/simplifyPlane")
    public String simplifyPlane(String version) {
        return lookup("Plane", version).getTravelName();
    }
}
