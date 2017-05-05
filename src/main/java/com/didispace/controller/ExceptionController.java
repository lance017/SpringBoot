package com.didispace.controller;

import com.didispace.tongyicuowuchuli.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lance017 on 2017/5/5.
 */

@Controller
@RequestMapping("/exception")
public class ExceptionController {

    /**
     * 错误处理返回网页
     * @throws Exception
     */
    @RequestMapping("/")
    public void exception() throws Exception {
        throw new Exception("错误处理");
    }

    /**
     * 错误处理返回json
     * @return
     * @throws MyException
     */
    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误");
    }

}
