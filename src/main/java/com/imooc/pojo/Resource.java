package com.imooc.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 小瓜瓜 <tanwei@movee.cn>
 * @date 2019/7/31 15:55
 **/
@Configuration //标注此类为配置类
@ConfigurationProperties(prefix = "com.imooc.opensource")  //配置字段前缀
@PropertySource("classpath:resources.properties")  //配置文件地址
public class Resource {
    private String name;
    private String website;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
