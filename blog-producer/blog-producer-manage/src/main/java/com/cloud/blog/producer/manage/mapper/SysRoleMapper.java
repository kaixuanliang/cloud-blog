package com.cloud.blog.producer.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cloud.blog.common.base.dto.query.SysRoleQueryDto;
import com.cloud.blog.common.mybatis.entity.manage.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 角色 Mapper 接口
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    IPage<SysRole> findPageQueryRole(Page<SysRole> pageParam, @Param("dto") SysRoleQueryDto sysRoleQueryDto);
}
