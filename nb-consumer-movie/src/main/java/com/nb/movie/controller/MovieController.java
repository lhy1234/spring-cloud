package com.nb.movie.controller;

import com.nb.movie.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by: 李浩洋 on 2020-04-03
 **/
@RequestMapping("/movies")
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public UserDTO findUserById(@PathVariable int id){
        UserDTO userDTO = restTemplate.getForObject("http://localhost:8090/users/"+id,UserDTO.class);
        return userDTO;
    }
}
