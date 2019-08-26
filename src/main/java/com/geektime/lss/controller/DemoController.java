package com.geektime.lss.controller;

import com.gaodun.lss.start.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuaishuai
 * @date 2019/8/26 13:38
 */
@RestController
@RequestMapping("/")
public class DemoController {

//    @Value("${gaodun.lss.name}")
//    private String name;
//
//    @Value("${gaodun.lss.age}")
//    private Integer age;

    @Autowired
    private PersonService personService;


    @GetMapping("/person")
    public String getPerson() {
        return personService.sayHello();
    }


}
