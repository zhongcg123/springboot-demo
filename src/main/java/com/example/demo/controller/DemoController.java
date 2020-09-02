package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Project Name:spxt
 * File Name:DemoController
 * Copyright (c) 2020,南京通达海科技股份有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             Author      Version     Description
 * ------------------------------------------------------------------
 * 2020/9/2 19:38   zhongcg         1.0       1.0 Version
 **/
@RestController
@RequestMapping(("/demo"))
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
