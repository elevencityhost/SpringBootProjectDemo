package com.example.controller;

import com.example.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * RestController注解的意思是controller里面所有方法的输出全部是以json格式输出
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    @PostMapping("hello")
    public String hello(@RequestParam("id") Integer id){
        return "id="+id;
    }
}
