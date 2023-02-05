package com.cloud.blog.common.mybatis.trans;

import com.cloud.blog.common.base.dto.manage.*;
import com.cloud.blog.common.mybatis.entity.manage.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author: lkx
 * @since: 2023/2/5 11:42
 * @description: dto转换成entity
 */
@Mapper
public interface DtoTransEntityUtil {
    DtoTransEntityUtil INSTANCE = Mappers.getMapper(DtoTransEntityUtil.class);

    SysDept dtoTransEntity(SysDeptDto sysDeptDto);

    SysLoginLog dtoTransEntity(SysLoginLogDto sysLoginLogDto);

    SysMenu dtoTransEntity(SysMenuDto sysMenuDto);

    SysOperLog dtoTransEntity(SysOperLogDto sysOperLogDto);

    SysPost dtoTransEntity(SysPostDto sysPostDto);

    SysRole dtoTransEntity(SysRoleDto sysRoleDto);

    SysRoleMenu dtoTransEntity(SysRoleMenuDto sysRoleMenuDto);

    SysUser dtoTransEntity(SysUserDto sysUserDto);

    SysUserRole dtoTransEntity(SysUserRoleDto sysUserRoleDto);


    List<SysDept> deptListTransEntity(List<SysDeptDto> list);

    List<SysLoginLog> loginLogListTransEntity(List<SysLoginLogDto> list);

    List<SysMenu> menuListTransEntity(List<SysMenuDto> list);

    List<SysOperLog> operLogListTransEntity(List<SysOperLogDto> list);

    List<SysPost> postListTransEntity(List<SysPostDto> list);

    List<SysRole> roleListTransEntity(List<SysRoleDto> list);

    List<SysRoleMenu> roleMenuListTransEntity(List<SysRoleMenuDto> list);

    List<SysUser> userListTransEntity(List<SysUserDto> list);

    List<SysUserRole> userRoleListTransEntity(List<SysUserRoleDto> list);

}
