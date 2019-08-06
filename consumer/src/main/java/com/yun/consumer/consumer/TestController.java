package com.yun.consumer.consumer;

import com.alibaba.fastjson.JSONObject;
import com.yun.provider.provider.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController{
    @Autowired
    DemoService demoService;

    @ResponseBody
    @RequestMapping("/test/{name}")
    public JSONObject testJson(@PathVariable("name") String name){
        JSONObject jsonObject = new JSONObject();
        String testStr = demoService.sayHello(name);
        jsonObject.put("str", testStr);
        return jsonObject;
    }
}