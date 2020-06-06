package springboot.web.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestStandard1 {

    @RequestMapping("/TestStandard1")
    public String TestStandard1() {
        int k = 0;
        k++;
        if (k == 1) {
            return "OK,爱你哟";
        }
        return "沙雕";
    }

}
