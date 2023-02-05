package com.cloud.blog.common.mybatis.entity.manage;

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
 * 组织机构
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 16:58:56
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_dept")
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    /**
     * 部门名称
     */
    @TableField("name")
    private String name;

    /**
     * 上级部门id
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 树结构
     */
    @TableField("tree_path")
    private String treePath;

    /**
     * 排序
     */
    @TableField("sort_value")
    private Integer sortValue;

    /**
     * 负责人
     */
    @TableField("leader")
    private String leader;

    /**
     * 电话
     */
    @TableField("phone")
    private String phone;

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
