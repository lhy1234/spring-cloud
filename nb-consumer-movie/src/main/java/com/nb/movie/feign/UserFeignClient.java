package com.nb.movie.feign;

import com.nb.movie.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nb-provider-user")
public interface UserFeignClient {

    //注意，这里的请求方法和参数，一定要和 提供者一致！否则报错404
    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") int id);
}
