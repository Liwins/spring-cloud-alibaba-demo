package cn.riversky.spring.cloud.nacos.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author riversky
 * @date 2019/11/29
 **/
@RestController
@RefreshScope
public class EchoeController {
    /**
     * 注入配置文件上下文
     */
    @Value("${server.port}")
    private String port;
    @Value("${user.name}")
    private String userName;

    @GetMapping("echo/{message}")
    public String echo(@PathVariable String message){
        return "hello :"+port+"  "+userName+"---"+message;
    }
}
