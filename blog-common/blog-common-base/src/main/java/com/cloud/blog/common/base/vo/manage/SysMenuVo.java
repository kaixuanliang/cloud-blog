package com.cloud.blog.common.base.vo.manage;

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
public class SysMenuVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 所属上级
     */
    private Long parentId;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型(0:目录,1:菜单,2:按钮)
     */
    private Integer type;

    /**
     * 路由地址
     */
    private String path;

    /**
     * 组件路径
     */
    private String component;

    /**
     * 权限标识
     */
    private String perms;

    /**
     * 图标
     */
    private String icon;

    /**
     * 排序
     */
    private Integer sortValue;

    /**
     * 状态(0:禁止,1:正常)
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除标记（0:可用 1:已删除）
     */
    private Boolean isDeleted;
}
