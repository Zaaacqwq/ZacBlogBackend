package com.zaaac.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zaaac.domain.entity.RoleMenu;


/**
 * 角色和菜单关联表(RoleMenu)表服务接口
 *
 * @author makejava
 * @since 2024-05-14 17:52:39
 */
public interface RoleMenuService extends IService<RoleMenu> {
    void deleteRoleMenuByRoleId(Long id);
}

