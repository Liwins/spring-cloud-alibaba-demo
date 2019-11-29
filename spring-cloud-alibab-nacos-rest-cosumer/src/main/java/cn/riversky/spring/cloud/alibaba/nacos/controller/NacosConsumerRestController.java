package cn.riversky.spring.cloud.alibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author riversky
 * @date 2019/11/27
 **/
@RestController
public class NacosConsumerRestController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @Value("${spring.application.name}")
    private String appName;
    @GetMapping(value = "echo/app/name")
    public String echo(){
        ServiceInstance choose = loadBalancerClient.choose("nacos-provider");
        String url = String.format("http://%s:%s/echo/%s", choose.getHost(), choose.getPort(), appName);
        return restTemplate.getForObject(url,String.class);
    }
}
