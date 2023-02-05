package com.cloud.blog.producer.manage.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cloud.blog.common.base.dto.manage.SysRoleDto;
import com.cloud.blog.common.base.dto.query.SysRoleQueryDto;
import com.cloud.blog.common.base.result.Result;
import com.cloud.blog.common.mybatis.entity.manage.SysRole;
import com.cloud.blog.producer.manage.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 角色 前端控制器
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
@RestController
@RequestMapping("/producer/manage/sysRole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("/findAll")
    public List<SysRoleDto> findAll(){
        return sysRoleService.findAll();
    }

    @DeleteMapping("/removeRole/{id}")
    public boolean removeRole(@PathVariable(value = "id") Long id){
        return sysRoleService.removeRole(id);
    }

    @GetMapping("/findPageQueryRole/{page}/{limit}")
    public Result<IPage<SysRole>> findPageQueryRole(@PathVariable(value = "page") Long page, @PathVariable(value = "limit") Long limit, SysRoleQueryDto sysRoleQueryDto){
        IPage<SysRole> sysRolePage = sysRoleService.findPageQueryRole(page,limit,sysRoleQueryDto);
        return Result.ok(sysRolePage);
    }
}
