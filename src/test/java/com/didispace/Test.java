package com.didispace;

import com.didispace.domain.User;
import com.didispace.domain.UserMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lance017 on 2017/5/5.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired(required = false)
    private UserMapper userMapper;

    @org.junit.Test
    public void test() {
        User user = new User();
        user.setAge(23);
        user.setName("lance");
        int i = userMapper.insert(user);
    }

}
