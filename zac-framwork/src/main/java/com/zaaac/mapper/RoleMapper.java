package com.zaaac.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zaaac.domain.entity.Role;

import java.util.List;


/**
 * 角色信息表(Role)表数据库访问层
 *
 * @author makejava
 * @since 2024-05-13 18:08:28
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleKeyByUserId(Long userId);

    List<Long> selectRoleIdByUserId(Long userId);
}


