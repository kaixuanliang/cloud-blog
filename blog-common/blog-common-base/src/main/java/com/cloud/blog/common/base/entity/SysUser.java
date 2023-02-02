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
 * 用户表
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 16:58:57
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 会员id
     */
    @TableId("id")
    private Long id;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 手机
     */
    @TableField("phone")
    private String phone;

    /**
     * 头像地址
     */
    @TableField("head_url")
    private String headUrl;

    /**
     * 部门id
     */
    @TableField("dept_id")
    private Long deptId;

    /**
     * 岗位id
     */
    @TableField("post_id")
    private Long postId;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

    /**
     * 状态（1：正常 0：停用）
     */
    @TableField("status")
    private Boolean status;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 删除标记（0:可用 1:已删除）
     */
    @TableField("is_deleted")
    private Boolean isDeleted;
}
