package com.zcj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Since2017/4/18 ZhaCongJie@HF
 */
@Controller
@RequestMapping("/user")
public class userController {
    @RequestMapping(value = "/toLogin")
    public ModelAndView toLogin(){
        return new ModelAndView("index");
    }
}
