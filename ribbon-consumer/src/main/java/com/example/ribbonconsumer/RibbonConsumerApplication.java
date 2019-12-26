package com.example.ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 需要做两件事：
 * 1.亮明Eureka客户端身份
 * 首先在入口类上添加@EnableDiscoveryClient注解，表示该应用是一个Eureka客户端应用，这样该应用就自动具备了发现服务的能力。
 * 2.提供RestTemplate的Bean
 * RestTemplate可以帮助我们发起一个GET或者POST请求
 * 在提供Bean的同时，添加@LoadBalanced注解，表示开启客户端负载均衡
 * @author Administrator
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
