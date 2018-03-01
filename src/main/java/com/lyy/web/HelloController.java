package com.lyy.web;

import com.lyy.dubbo.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
	private TestInterface testInterface;



    @RequestMapping("/hello")
    public String sayHello(String name) {
        String result = testInterface.sayHello(name);
        System.out.println(result);
        return result;
    }

}