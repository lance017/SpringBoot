package com.didispace;

import com.didispace.domain.User;
import com.didispace.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lance017 on 2017/5/4.
 */

@SpringBootApplication
@RestController
public class Application {


    @RequestMapping("/")
    public String test() {
        return "hello,发光的我";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
