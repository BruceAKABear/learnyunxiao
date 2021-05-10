package pro.dengyi.learnyunxiao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DengYi
 * @version v1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    //注释
    @GetMapping("/doDemo")
    public Map<String, Object> doDemo() {
        HashMap<String, Object> hashMap = new HashMap<>(2);
        hashMap.put("code", 200);
        hashMap.put("message", "hello world");
        return hashMap;
    }
}
