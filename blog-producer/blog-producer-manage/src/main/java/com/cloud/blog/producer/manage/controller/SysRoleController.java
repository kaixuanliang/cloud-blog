package com.cloud.blog.producer.manage.controller;

import com.cloud.blog.common.base.dto.manage.SysRoleDto;
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

}
