package com.tedu.java.service;

import com.tedu.java.pojo.User;

import javax.ws.rs.*;
import java.util.List;


// 访问当前服务接口对应的路径
@Path("/userService")
@Produces("*/*") //表示服务器支持的返回的数据格式类型
public interface IUserService {
    // 表示处理请求的类型,post对应的是insert方法
    @POST
    // 访问当前服务接口方法对应的路径
    @Path("/user")
    // 服务器支持的请求的数据格式类型
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);
    // 表示处理请求的类型,put对应的是update方法
    @PUT
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void update(User user);
    // 表示处理请求的类型,get对应的是select方法
    @GET
    @Path("/user")
    @Produces({"application/xml","application/json"})
    public List<User> findAllUsers();

    @GET
    @Path("/user/{id}")
    @Consumes("application/xml")
    @Produces({"application/xml","application/json"})
    public User findUserById(@PathParam("id") Integer id);
    // 表示处理请求的类型,get对应的是delete方法
    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(@PathParam("id") Integer id);
}
