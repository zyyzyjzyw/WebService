package com.tedu.java;

import com.tedu.java.service.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @author： zyy
 * @date： 2023/2/11 13:27
 * @description： TODO
 * @version: 1.0
 * @描述：
 **/
public class Server {
    public static void main(String[] args) {
        // 发布服务的工厂
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        // 设置服务地址
        factoryBean.setAddress("http://localhost:8000/ws/hello");
        // 设置服务类
        factoryBean.setServiceBean(new HelloServiceImpl());
        // 发布服务
        factoryBean.create();
        System.out.println("发布服务成功,端口号80000");
    }
}
