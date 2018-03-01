package com.didispace.web;

import com.didispace.inter.TestInterface;
import com.didispace.util.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
	private TestInterface testInterface;



    @RequestMapping("/hello")
    public String index(String bigObject,String bigObject1) {
        String result = testInterface.sayHello(bigObject,bigObject1);
        System.out.println(result);
        return "Hello World";
    }

}