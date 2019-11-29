package cn.riversky.spring.cloud.alibaba.nacos.service.feign;

import cn.riversky.spring.cloud.alibaba.nacos.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author riversky
 * @date 2019/11/28
 **/
@Component
public class EchoServiceFallback implements EchoService
{
    @Override
    public String echo(String message) {
        return "echo fallback";
    }
}
