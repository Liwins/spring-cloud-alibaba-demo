package cn.riversky.spring.cloud.alibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author riversky
 * @date 2019/11/27
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class RestComsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestComsumerApplication.class,args);
    }
}
