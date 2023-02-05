package com.cloud.blog.producer.manage.service.impl;

import com.cloud.blog.common.base.dto.manage.SysUserDto;
import com.cloud.blog.common.mybatis.entity.manage.SysUser;
import com.cloud.blog.producer.manage.mapper.SysUserMapper;
import com.cloud.blog.producer.manage.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    public SysUserDto queryByUsername(String username) {
        return null;
    }
}
