package com.cloud.blog.common.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统访问记录
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 16:58:56
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_login_log")
public class SysLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 访问ID
     */
    @TableId("id")
    private Long id;

    /**
     * 用户账号
     */
    @TableField("username")
    private String username;

    /**
     * 登录IP地址
     */
    @TableField("ipaddr")
    private String ipaddr;

    /**
     * 登录状态（0成功 1失败）
     */
    @TableField("status")
    private Boolean status;

    /**
     * 提示信息
     */
    @TableField("msg")
    private String msg;

    /**
     * 访问时间
     */
    @TableField("access_time")
    private Date accessTime;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    /**
     * 删除标记（0:可用 1:已删除）
     */
    @TableField("is_deleted")
    private Boolean isDeleted;
}
