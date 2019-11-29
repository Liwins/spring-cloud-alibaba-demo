package cn.riversky.spring.cloud.alibaba.nacos.controller;

import cn.riversky.spring.cloud.alibaba.nacos.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author riversky
 * @date 2019/11/27
 **/
@RestController
public class NacosConsumerFeignController {
    @Autowired
    private EchoService echoService;

    @GetMapping(value = "echo/hi")
    public String echo(){
        return echoService.echo("Hi Feign");
    }
}
