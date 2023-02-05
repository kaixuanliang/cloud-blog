package com.cloud.blog.consumer.manage.service.feign;

import com.cloud.blog.common.base.dto.manage.SysRoleDto;
import com.cloud.blog.common.base.dto.query.SysRoleQueryDto;
import com.cloud.blog.common.base.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author: LiangKaiXuan
 * @Description: 文章服务接口
 * @ProjectName: cloud-blog
 * @Date: 2023/1/3116:02
 * @Version: V1.0
 */
@FeignClient(name = "blog-producer-manage")
public interface ManageProducerFeignService {
    @GetMapping("/producer/manage/sysRole/findAll")
    List<SysRoleDto> findAll();

    @DeleteMapping("/producer/manage/sysRole/removeRole/{id}")
    boolean removeRole(@PathVariable(value = "id") Long id);

    @GetMapping("/producer/manage/sysRole/findPageQueryRole/{page}/{limit}")
    Result findPageQueryRole(@PathVariable(value = "page") Long page, @PathVariable(value = "limit") Long limit,@SpringQueryMap SysRoleQueryDto sysRoleQueryDto);
}
