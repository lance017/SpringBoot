package com.didispace.controller;

import com.didispace.domain.Student;
import com.didispace.domain.StudentMapper;
import com.didispace.domain.User;
import com.didispace.domain.UserMapper;
import com.didispace.yiduiduo.Brand;
import com.didispace.yiduiduo.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lance017 on 2017/5/5.
 */
@RestController
@RequestMapping("/mybatis")
public class MybatisController {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired(required = false)
    private StudentMapper studentMapper;

    @Autowired(required = false)
    private BrandMapper brandMapper;

    @RequestMapping("/user/{id}")
    public String user(@PathVariable Long id) throws Exception{
        return "id = " + id;
    }

    /**
     * 初始测试
     * @return
     */
    @RequestMapping("/insert")
    public String getId() {
        User user = new User();
        user.setAge(23);
        user.setName("lance");
        int i = userMapper.insert(user);
        return "id = " + user.getId() + ", 影响的行数 = " + i;
    }


    /**
     * 获取结果集测试
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("sss");
        List<User> ls = userMapper.findAll("lance");
        return "ls = " + ls;
    }


    /**
     * 获取 col 与 property 不对应的结果集测试
     * @return
     */
    @RequestMapping("/findAllUser")
    public List<User> findAllUser() {
        List<User> ls = userMapper.findAllUser();
        return ls;
    }


    /**
     * 1对1结果测试
     * @return
     */
    @RequestMapping("/findStudent")
    public Student findStudent() {
        Student ls = studentMapper.selectStudentWithAddress(1);
        return ls;
    }

    /**
     * 1对n结果测试
     * @return
     */
    @RequestMapping("/findBrand")
    public Brand findBrand() {
        Brand brand = brandMapper.findBrand(1);
        return brand;
    }

}
