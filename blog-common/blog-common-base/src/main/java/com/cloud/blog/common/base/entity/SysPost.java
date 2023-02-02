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
 * 岗位信息表
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 16:58:57
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_post")
public class SysPost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位ID
     */
    @TableId("id")
    private Long id;

    /**
     * 岗位编码
     */
    @TableField("post_code")
    private String postCode;

    /**
     * 岗位名称
     */
    @TableField("name")
    private String name;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

    /**
     * 状态（1正常 0停用）
     */
    @TableField("status")
    private Boolean status;

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
