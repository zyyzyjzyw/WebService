package com.tedu.java;

import com.tedu.java.pojo.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * Unit test for simple App.
 */
public class Client
{
    @Test
    public void testSave(){
    // 通过webClient对象远程调用服务端
        WebClient.create("http://localhost:8082/ws/userService/user")
                .type(MediaType.APPLICATION_JSON) //指定请求的数据格式为json
                .post(new User(100,"jerry","gz",null));
}

@Test
    public void testSelect(){
    // 通过webClient对象远程调用服务端
    User user = WebClient.create("http://localhost:8082/ws/userService/user/1")
            .type(MediaType.APPLICATION_JSON) //指定请求的数据格式为json
            .get(User.class);
    System.out.println(user);

}
}
