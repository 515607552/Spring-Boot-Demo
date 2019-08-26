package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小瓜瓜 <tanwei@movee.cn>
 * @date 2019/6/18 17:21
 *
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return "hello 123";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean); //属性copy
        return IMoocJSONResult.ok(bean);
    }
}
