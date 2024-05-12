package com.zaaac.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zaaac.domain.entity.User;
import com.zaaac.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.zaaac.service.UserService;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2024-05-12 04:47:05
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

