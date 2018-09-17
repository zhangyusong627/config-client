package com.zys.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分布式配置中心客户端启动类
 * @author ASUS
 *
 */

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);

	}
	
	
	@Value("${userName}")
	String userName;

	@RequestMapping(value = "/getUserName")
	public String getUserName () {
		return userName;
	}

}
