package com.cloud.blog.producer.manage.service.impl;

import com.cloud.blog.common.base.entity.SysOperLog;
import com.cloud.blog.producer.manage.mapper.SysOperLogMapper;
import com.cloud.blog.producer.manage.service.SysOperLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志记录 服务实现类
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
@Service
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog> implements SysOperLogService {

}
