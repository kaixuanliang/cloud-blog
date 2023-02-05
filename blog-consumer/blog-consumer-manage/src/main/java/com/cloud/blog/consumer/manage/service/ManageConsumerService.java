package com.cloud.blog.consumer.manage.service;

import com.cloud.blog.common.base.result.Result;
import com.cloud.blog.common.base.vo.manage.SysRoleVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: LiangKaiXuan
 * @Description: 系统管理
 * @ProjectName: cloud-blog
 * @Date: 2023/2/117:50
 * @Version: V1.0
 */
public interface ManageConsumerService {
    Result<List<SysRoleVo>> findAllRoleList();

    Result<Boolean> removeRole(Long id);
}