package com.qf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/6/25 11:29
 */
@RestController
public class LqbController {

    @RequestMapping("lqbTest")
    public Object lqbTest(){
        return "lqbTest";
    }
}
