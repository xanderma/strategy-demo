package cn.supermartin.martin.strategy.web.travel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 策略模式的常规用法
 */
@RequestMapping
@RestController
public class TravelController {
    @Autowired
    private TravelStrategy travelStrategy;

    @RequestMapping("/train")
    public String train(String version) {
        return travelStrategy.lookup("Train", version).getTravelName();
    }

    @RequestMapping("/plane")
    public String plane(String version) {
        return travelStrategy.lookup("Plane", version).getTravelName();
    }
}
