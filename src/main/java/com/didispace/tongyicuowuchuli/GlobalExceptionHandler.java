package com.didispace.tongyicuowuchuli;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lance017 on 2017/5/4.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    /**
     * 自定义错误并返回 json
     * @return
     * @throws MyException
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler() throws MyException{
        ErrorInfo<String> info = new ErrorInfo<>();
        info.setCode(ErrorInfo.ERROR);
        info.setMessage("错误");
        info.setUrl("www.baidu.com");
        info.setData("some data");
        return info;
    }

    /**
     * 返回错误网址
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler () throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(DEFAULT_ERROR_VIEW);
        return modelAndView;
    }




}
