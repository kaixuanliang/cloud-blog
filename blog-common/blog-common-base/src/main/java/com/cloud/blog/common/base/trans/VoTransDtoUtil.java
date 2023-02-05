package com.cloud.blog.common.base.trans;

import com.cloud.blog.common.base.dto.manage.*;
import com.cloud.blog.common.base.vo.manage.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author: lkx
 * @since: 2023/2/5 12:03
 * @description: vo转换成dto
 */
@Mapper
public interface VoTransDtoUtil {
    VoTransDtoUtil INSTANCE = Mappers.getMapper(VoTransDtoUtil.class);

    SysDeptDto voTransDto(SysDeptVo sysDeptVo);

    SysLoginLogDto voTransDto(SysLoginLogVo sysLoginLogVo);

    SysMenuDto voTransDto(SysMenuVo sysMenuVo);

    SysOperLogDto voTransDto(SysOperLogVo sysOperLogVo);

    SysPostDto voTransDto(SysPostVo sysPostVo);

    SysRoleDto voTransDto(SysRoleVo sysRoleVo);

    SysRoleMenuDto voTransDto(SysRoleMenuVo sysRoleMenuVo);

    SysUserDto voTransDto(SysUserVo sysUserVo);

    SysUserRoleDto voTransDto(SysUserRoleVo sysUserRoleVo);


    List<SysDeptDto> deptListTransDto(List<SysDeptVo> list);

    List<SysLoginLogDto> loginLogListTransDto(List<SysLoginLogVo> list);

    List<SysMenuDto> menuListTransDto(List<SysMenuVo> list);

    List<SysOperLogDto> operLogListTransDto(List<SysOperLogVo> list);

    List<SysPostDto> postListTransDto(List<SysPostVo> list);

    List<SysRoleDto> roleListTransDto(List<SysRoleVo> list);

    List<SysRoleMenuDto> roleMenuListTransDto(List<SysRoleMenuVo> list);

    List<SysUserDto> userListTransDto(List<SysUserVo> list);

    List<SysUserRoleDto> userRoleListTransDto(List<SysUserRoleVo> list);
}
