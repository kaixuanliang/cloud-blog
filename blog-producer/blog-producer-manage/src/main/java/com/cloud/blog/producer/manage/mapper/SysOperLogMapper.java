package com.cloud.blog.producer.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.blog.common.mybatis.entity.manage.SysOperLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 操作日志记录 Mapper 接口
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 15:56:22
 */
@Mapper
public interface SysOperLogMapper extends BaseMapper<SysOperLog> {

}
