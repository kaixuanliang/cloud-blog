package com.cloud.blog.producer.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.blog.common.base.dto.manage.SysUserDto;
import com.cloud.blog.common.mybatis.entity.manage.SysUser;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 根据用户名查询出用户信息
     * @param username
     * @return
     */
    SysUserDto queryByUsername(String username);
}
