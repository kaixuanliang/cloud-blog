package com.cloud.blog.common.base.trans;

import com.cloud.blog.common.base.dto.manage.*;
import com.cloud.blog.common.base.vo.manage.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author: lkx
 * @since: 2023/2/5 12:03
 * @description: Dto转换成Vo
 */
@Mapper
public interface DtoTransVoUtil {
    DtoTransVoUtil INSTANCE = Mappers.getMapper(DtoTransVoUtil.class);

    SysDeptVo dtoTransVo(SysDeptDto sysDeptDto);

    SysLoginLogVo dtoTransVo(SysLoginLogDto sysLoginLogDto);

    SysMenuVo dtoTransVo(SysMenuDto sysMenuDto);

    SysOperLogVo dtoTransVo(SysOperLogDto sysOperLogDto);

    SysPostVo dtoTransVo(SysPostDto sysPostDto);

    SysRoleVo dtoTransVo(SysRoleDto sysRoleDto);

    SysRoleMenuVo dtoTransVo(SysRoleMenuDto sysRoleMenuDto);

    SysUserVo dtoTransVo(SysUserDto sysUserDto);

    SysUserRoleVo dtoTransVo(SysUserRoleDto sysUserRoleDto);


    List<SysDeptVo> deptListTransVo(List<SysDeptDto> list);

    List<SysLoginLogVo> loginLogListTransVo(List<SysLoginLogDto> list);

    List<SysMenuVo> menuListTransVo(List<SysMenuDto> list);

    List<SysOperLogVo> operLogListTransVo(List<SysOperLogDto> list);

    List<SysPostVo> postListTransVo(List<SysPostDto> list);

    List<SysRoleVo> roleListTransVo(List<SysRoleDto> list);

    List<SysRoleMenuVo> roleMenuListTransVo(List<SysRoleMenuDto> list);

    List<SysUserVo> userListTransVo(List<SysUserDto> list);

    List<SysUserRoleVo> userRoleListTransVo(List<SysUserRoleDto> list);
}
