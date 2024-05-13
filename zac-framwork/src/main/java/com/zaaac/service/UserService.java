package com.zaaac.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zaaac.domain.ResponseResult;
import com.zaaac.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2024-05-12 04:47:04
 */
public interface UserService extends IService<User> {

    ResponseResult userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);
}

