package com.cloud.blog.consumer.manage.service.impl;

import com.cloud.blog.common.base.dto.manage.SysRoleDto;
import com.cloud.blog.common.base.result.Result;
import com.cloud.blog.common.base.trans.DtoTransVoUtil;
import com.cloud.blog.common.base.vo.manage.SysRoleVo;
import com.cloud.blog.consumer.manage.service.ManageConsumerService;
import com.cloud.blog.consumer.manage.service.feign.ManageProducerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiangKaiXuan
 * @Description: 系统管理
 * @ProjectName: cloud-blog
 * @Date: 2023/2/117:50
 * @Version: V1.0
 */
@Service
public class ManageConsumerServiceImpl implements ManageConsumerService {

    @Autowired
    private ManageProducerFeignService manageProducerFeignService;

    @Override
    public Result<List<SysRoleVo>> findAllRoleList() {
        List<SysRoleDto> sysRoleDtoList = manageProducerFeignService.findAll();
        List<SysRoleVo> list = DtoTransVoUtil.INSTANCE.roleListTransVo(sysRoleDtoList);
        return Result.ok(list);
    }

    @Override
    public Result<Boolean> removeRole(Long id) {
        Boolean result = manageProducerFeignService.removeRole(id);
        return Result.ok(result);
    }
}