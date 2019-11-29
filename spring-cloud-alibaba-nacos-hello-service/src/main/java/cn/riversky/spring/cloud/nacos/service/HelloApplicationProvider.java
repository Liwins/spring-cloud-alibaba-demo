package cn.riversky.spring.cloud.nacos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author riversky
 * @date 2019/11/27
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class HelloApplicationProvider {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplicationProvider.class,args);
    }
}
