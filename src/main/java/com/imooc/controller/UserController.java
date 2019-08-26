package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.imooc.pojo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController //RestController = Controller + ResponseBody
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
//    @ResponseBody
    public User getUser(){
        User user = new User();
        user.setName("中二码农3");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setPassword("ces");
        return user;
    }

    @RequestMapping("/getUserJson")
//    @ResponseBody
    public IMoocJSONResult getUserJson(){
        User user = new User();
        user.setName("中二码农");
        user.setAge(18);/**/
        user.setBirthday(new Date());
        user.setPassword("123456");
        user.setDesc("userJson8");

        //即使将设置了JsonIgnore 依然可以get获取
        /*String pwd = user.getPassword();
        return IMoocJSONResult.ok(pwd);
*/
        return IMoocJSONResult.ok(user);
    }

    @RequestMapping("/getTest")
    public IMoocJSONResult getTest(){
        List<String> columnNames = new ArrayList<>();
        int a_assic = 65;
        for (int i = 0; i < 26; i++) {
            columnNames.add(((char) (i + a_assic)) + "");
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                columnNames.add(((char) (i + a_assic)) + "" + ((char) (j + a_assic)));
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    columnNames.add(((char) (i + a_assic)) + "" + ((char) (j + a_assic)) + "" + ((char) (k + a_assic)));
                }
            }
        }
        return IMoocJSONResult.ok(columnNames.size());
    }
}
