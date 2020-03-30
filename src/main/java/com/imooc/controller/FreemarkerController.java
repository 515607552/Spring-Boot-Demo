package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.imooc.pojo.Resource;
/**
 * @author 中二码农 <tanwei@movee.cn>
 * @date 2020/3/30 16:58
 **/
@Controller
@RequestMapping("ftl")
public class FreemarkerController {
    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("resource",resource);
        return "freemarker/index";
    }

    @RequestMapping("conter")
    public String conter(){
        return "freemarker/conter/conter";
    }
}
