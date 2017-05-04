package com.didispace;

import com.didispace.domain.User;
import com.didispace.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lance017 on 2017/5/4.
 */

@SpringBootApplication
public class Application {



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
