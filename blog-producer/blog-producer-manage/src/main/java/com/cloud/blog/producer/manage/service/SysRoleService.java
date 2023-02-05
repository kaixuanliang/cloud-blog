package com.cloud.blog.producer.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.blog.common.base.dto.manage.SysRoleDto;
import com.cloud.blog.common.mybatis.entity.manage.SysRole;

import java.util.List;

/**
 * <p>
 * 角色 服务类
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
public interface SysRoleService extends IService<SysRole> {

    List<SysRoleDto> findAll();

    boolean removeRole(Long id);
}
