package com.tedu.java;

import com.tedu.java.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author： zyy
 * @date： 2023/2/11 17:49
 * @description： TODO
 * @version: 1.0
 * @描述：
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Client {
    // 注入对象
    @Autowired
    private HelloService helloService;

    @Test
    public void testClient(){
        // 查看接口的代理对象
        System.out.println(helloService.getClass());
        // 远程访问服务端方法
        System.out.println(helloService.sayHello("zyj"));
    }
}
