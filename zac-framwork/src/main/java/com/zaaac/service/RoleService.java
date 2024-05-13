package com.zaaac.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zaaac.domain.entity.Role;

import java.util.List;


/**
 * 角色信息表(Role)表服务接口
 *
 * @author makejava
 * @since 2024-05-13 18:08:30
 */
public interface RoleService extends IService<Role> {

    List<String> selectRoleKeyByUserId(Long id);
}

