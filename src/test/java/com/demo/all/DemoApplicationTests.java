package com.demo.all;

import com.demo.all.dao.base.UserJPA;
import com.demo.all.dao.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.demo.all.dao.mapper")
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserJPA userJPA;

    @Test
    public void contextLoads() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //System.out.println("mybatis:"+userMapper.selectByPrimaryKey(1).getUserName());
        //System.out.println("mybatis-map:"+userMapper.selectByPrimaryKeyToMap(1).toString());
        //System.out.println("jpa:"+userJPA.findOne(1).getUserName());
        PageHelper.startPage(1, 2);
        List userList= userMapper.selectAll();
        //PageInfo<List> pageInfo = new PageInfo<>(userList);
        System.out.println(userList.toString());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}

