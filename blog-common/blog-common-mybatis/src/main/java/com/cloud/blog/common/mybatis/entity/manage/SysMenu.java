package com.cloud.blog.common.mybatis.entity.manage;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 16:58:56
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_menu")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId("id")
    private Long id;

    /**
     * 所属上级
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 类型(0:目录,1:菜单,2:按钮)
     */
    @TableField("type")
    private Integer type;

    /**
     * 路由地址
     */
    @TableField("path")
    private String path;

    /**
     * 组件路径
     */
    @TableField("component")
    private String component;

    /**
     * 权限标识
     */
    @TableField("perms")
    private String perms;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 排序
     */
    @TableField("sort_value")
    private Integer sortValue;

    /**
     * 状态(0:禁止,1:正常)
     */
    @TableField("status")
    private Integer status;

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
    @TableLogic(value = "0",delval = "1")
    private Integer isDeleted;
}
