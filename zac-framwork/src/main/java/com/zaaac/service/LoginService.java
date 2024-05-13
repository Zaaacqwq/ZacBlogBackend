package com.zaaac.service;

import com.zaaac.domain.ResponseResult;
import com.zaaac.domain.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}

