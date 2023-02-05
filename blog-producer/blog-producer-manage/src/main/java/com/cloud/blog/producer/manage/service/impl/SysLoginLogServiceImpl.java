package com.cloud.blog.producer.manage.service.impl;

import com.cloud.blog.common.mybatis.entity.manage.SysLoginLog;
import com.cloud.blog.producer.manage.mapper.SysLoginLogMapper;
import com.cloud.blog.producer.manage.service.SysLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统访问记录 服务实现类
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
@Service
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogMapper, SysLoginLog> implements SysLoginLogService {

}
