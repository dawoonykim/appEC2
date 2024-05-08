package com.green.appec2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//24.05.08
@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @RequestMapping("/getArr")
    public String[] gettArr() {
        return new String[]{"A,B,C"};
    }
}
