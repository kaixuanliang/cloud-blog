package com.cloud.blog.consumer.manage.controller;

import com.cloud.blog.common.base.result.Result;
import com.cloud.blog.common.base.vo.manage.SysRoleVo;
import com.cloud.blog.common.base.vo.query.SysRoleQueryVo;
import com.cloud.blog.consumer.manage.service.ManageConsumerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: LiangKaiXuan
 * @Description: 系统管理
 * @ProjectName: cloud-blog
 * @Date: 2023/2/117:50
 * @Version: V1.0
 */
@Api(tags = "权限管理模块")
@RestController
@RequestMapping("/manage")
public class ManageConsumerController {

    @Autowired
    private ManageConsumerService manageConsumerService;

    @ApiOperation("权限管理-查询所有的角色")
    @GetMapping("/findAllRoleList")
    public Result<List<SysRoleVo>> findAllRoleList() {
        return manageConsumerService.findAllRoleList();
    }

    @ApiOperation("权限管理-根据主键逻辑删除角色")
    @DeleteMapping("/removeRole/{id}")
    public Result<Boolean> removeRole(@PathVariable Long id) {
        return manageConsumerService.removeRole(id);
    }

    @ApiOperation("权限管理-条件分页查询角色列表")
    @GetMapping("/findPageQueryRole/{page}/{limit}")
    public Result findPageQueryRole(@PathVariable(value = "page") Long page, @PathVariable(value = "limit") Long limit, SysRoleQueryVo sysRoleQueryVo) {
        return manageConsumerService.findPageQueryRole(page, limit, sysRoleQueryVo);
    }
}