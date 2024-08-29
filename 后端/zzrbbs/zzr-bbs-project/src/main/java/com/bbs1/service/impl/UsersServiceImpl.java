package com.bbs1.service.impl;

import com.bbs1.pojo.Users;
import com.bbs1.service.UsersService;
import com.bbs1.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public Users login(Users users) {
        Users u = usersMapper.getByUsernameAndPass(users);
        return u;
    }

    @Override
    public void register(Users users) {
        users.setCreateTime(LocalDateTime.now());
        users.setUpdateTime(LocalDateTime.now());
        usersMapper.insertUser(users);
    }
}
