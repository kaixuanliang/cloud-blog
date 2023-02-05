package com.cloud.blog.common.mybatis.trans;

import com.cloud.blog.common.base.dto.manage.*;
import com.cloud.blog.common.mybatis.entity.manage.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author: lkx
 * @since: 2023/2/5 11:42
 * @description:entity转换成dto
 */
@Mapper
public interface EntityTransDtoUtil {
    EntityTransDtoUtil INSTANCE = Mappers.getMapper(EntityTransDtoUtil.class);

    SysDeptDto entityTransDto(SysDept sysDept);

    SysLoginLogDto entityTransDto(SysLoginLog sysLoginLog);

    SysMenuDto entityTransDto(SysMenu sysMenu);

    SysOperLogDto entityTransDto(SysOperLog sysOperLog);

    SysPostDto entityTransDto(SysPost sysPost);

    SysRoleDto entityTransDto(SysRole sysRole);

    SysRoleMenuDto entityTransDto(SysRoleMenu sysRoleMenu);

    SysUserDto entityTransDto(SysUser sysUser);

    SysUserRoleDto entityTransDto(SysUserRole sysUserRole);


    List<SysDeptDto> deptListTransDto(List<SysDept> list);

    List<SysLoginLogDto> loginLogListTransDto(List<SysLoginLog> list);

    List<SysMenuDto> menuListTransDto(List<SysMenu> list);

    List<SysOperLogDto> operLogListTransDto(List<SysOperLog> list);

    List<SysPostDto> postListTransDto(List<SysPost> list);

    List<SysRoleDto> roleListTransDto(List<SysRole> list);

    List<SysRoleMenuDto> roleMenuListTransDto(List<SysRoleMenu> list);

    List<SysUserDto> userListTransDto(List<SysUser> list);

    List<SysUserRoleDto> userRoleListTransDto(List<SysUserRole> list);

}
