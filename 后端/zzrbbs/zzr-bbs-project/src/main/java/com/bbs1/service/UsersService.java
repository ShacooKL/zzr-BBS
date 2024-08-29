package com.bbs1.service;

import com.bbs1.pojo.Users;

public interface UsersService {
    Users login(Users users);

    void register(Users users);
}
