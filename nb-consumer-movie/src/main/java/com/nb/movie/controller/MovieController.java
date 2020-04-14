package com.nb.movie.controller;

import com.nb.movie.dto.User;
import com.nb.movie.feign.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by: 李浩洋 on 2020-04-03
 **/
@Slf4j
@RequestMapping("/movies")
@RestController
public class MovieController {

    /**
     * RestTemplate + Ribbon 与   Feign，实现的是一样的功能
     *
     */
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

//    @GetMapping("/user/{id}")
//    public UserDTO findUserById(@PathVariable int id){
//        UserDTO userDTO = restTemplate.getForObject("http://localhost:8090/users/"+id,UserDTO.class);
//        return userDTO;
//    }

//    @GetMapping("/user/{id}")
//    public UserDTO findUserById(@PathVariable int id){
//        // http://{目标服务名称}/{目标服务端点} 的形式
//        //Ribbon会自动在实际调用时，将目标服务名替换为该服务的IP和端口
//        //事实上，这里的目标服务名称，在Ribbon里叫虚拟主机名,主机名是不能包含_ 等特殊字符的
//        UserDTO userDTO = restTemplate.getForObject("http://nb-provider-user/users/{id}",UserDTO.class,id);
//        return userDTO;
//    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id){
        User userDTO = userFeignClient.findById(id);
        return userDTO;
    }

    @GetMapping("/logUserInstance")
    public Object logUserInstance(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("nb-provider-user");
        System.err.println(serviceInstance.getServiceId());
        System.err.println(serviceInstance.getHost()+":"+serviceInstance.getPort());
        System.err.println(serviceInstance.getScheme());
        System.err.println(serviceInstance.getUri());
        return serviceInstance;
    }
}
