package com.zaaac.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zaaac.domain.entity.Menu;

import java.util.List;


/**
 * 菜单权限表(Menu)表数据库访问层
 *
 * @author makejava
 * @since 2024-05-13 18:03:48
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long userId);

    List<Menu> selectAllRouterMenu();

    List<Menu> selectRouterMenuTreeByUserId(Long userId);

    List<Long> selectMenuListByRoleId(Long roleId);
}

