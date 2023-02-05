package com.cloud.blog.consumer.manage.controller;

import com.cloud.blog.common.base.result.Result;
import com.cloud.blog.common.base.vo.manage.SysRoleVo;
import com.cloud.blog.consumer.manage.service.ManageConsumerService;
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
@RestController
@RequestMapping("/blog/manage")
public class ManageConsumerController {

    @Autowired
    private ManageConsumerService manageConsumerService;
    @GetMapping("/findAllRoleList")
    public Result<List<SysRoleVo>> findAllRoleList(){
        return manageConsumerService.findAllRoleList();
    }

    @DeleteMapping("/removeRole/{id}")
    public Result<Boolean> removeRole(@PathVariable Long id){
        return manageConsumerService.removeRole(id);
    }
}