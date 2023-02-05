package com.cloud.blog.producer.manage.controller;

import com.cloud.blog.common.base.dto.manage.SysUserDto;
import com.cloud.blog.common.base.result.Result;
import com.cloud.blog.producer.manage.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
@RestController
@RequestMapping("/manage/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/queryByUsername/{username}")
    public SysUserDto queryByUsername(@PathVariable String username) {
        return sysUserService.queryByUsername(username);
    }
}
