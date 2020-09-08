package com.sweet.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guang.wang
 * @date 2020/9/8 13:42
 * @desc
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/aa")
    @ResponseBody
    public String aa(){
        return "aa";
    }
}
