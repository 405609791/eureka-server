package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//激活Eureka中的DiscoveryClient
//通过添加@EnableDiscoveryClient注解来激活Eureka中的DiscoveryClient实现（因为我们在HelloController中注入了DiscoveryClient）
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}

}
