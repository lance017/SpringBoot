package com.didispace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lance017 on 2017/5/5.
 */

@Controller
@RequestMapping("/moban")
public class MobanControllrt {

    @RequestMapping("/hello")
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("host", "http://blog.didispace.com");
        return "hello";
    }

}
