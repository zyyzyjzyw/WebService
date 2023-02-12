package com.tedu.java;

import com.tedu.java.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Unit test for simple App.
 */
public class Client
{
    public static void main(String[] args) {
        // 服务接口访问地址:http://localhost:8000/ws/hello
        // 创建cxf代理工厂
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        // 设置远程访问服务端地址
        factoryBean.setAddress("http://localhost:8000/ws/hello");
        // 设置接口类型
        factoryBean.setServiceClass(HelloService.class);
        // 生成接口代理对象
        HelloService helloService = factoryBean.create(HelloService.class);
        // 代理对象
        System.out.println(helloService.getClass());
        // 远程访问服务端方法
        String content = helloService.sayHello("zyy");
        System.out.println(content);
    }
}
