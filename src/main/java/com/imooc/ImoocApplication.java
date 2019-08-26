package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({com.imooc.pojo.Resource.class})
public class ImoocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImoocApplication.class, args);
	}

}
