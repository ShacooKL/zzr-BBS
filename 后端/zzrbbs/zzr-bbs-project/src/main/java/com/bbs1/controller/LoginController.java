package com.bbs1.controller;

import com.bbs1.pojo.Result;
import com.bbs1.pojo.Users;
import com.bbs1.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UsersService usersService;

    @PostMapping
    public Result login(@RequestBody Users users){
        log.info("登录操作，用户：{}",users);
        Users u = usersService.login(users);
        return Result.success(u);
    }
}
