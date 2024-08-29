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
@RequestMapping("/users")
@Slf4j
public class UsersController {
    @Autowired
    private UsersService usersService;

    //注册
    @PostMapping("/register")
    public Result register(@RequestBody Users users){
        usersService.register(users);
        return Result.success();
    }
}
