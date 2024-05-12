package com.zaaac.service;

import com.zaaac.domain.ResponseResult;
import com.zaaac.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}

