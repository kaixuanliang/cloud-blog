package com.cloud.blog.producer.manage.service.impl;

import com.cloud.blog.common.base.dto.manage.SysRoleDto;
import com.cloud.blog.common.mybatis.entity.manage.SysRole;
import com.cloud.blog.common.mybatis.trans.EntityTransDtoUtil;
import com.cloud.blog.producer.manage.mapper.SysRoleMapper;
import com.cloud.blog.producer.manage.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRoleDto> findAll() {
        List<SysRole> sysRoleList = sysRoleMapper.selectList(null);
        List<SysRoleDto> list = EntityTransDtoUtil.INSTANCE.roleListTransDto(sysRoleList);
        return list;
    }

    @Override
    public boolean removeRole(Long id) {
        return this.removeById(id);
    }
}
