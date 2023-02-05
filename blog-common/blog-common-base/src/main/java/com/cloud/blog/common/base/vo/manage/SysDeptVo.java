package com.cloud.blog.common.base.vo.manage;

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
public class SysDeptVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 上级部门id
     */
    private Long parentId;

    /**
     * 树结构
     */
    private String treePath;

    /**
     * 排序
     */
    private Integer sortValue;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 电话
     */
    private String phone;

    /**
     * 状态（1正常 0停用）
     */
    private Integer status;

    private Date createTime;

    private Date updateTime;

    /**
     * 删除标记（0:可用 1:已删除）
     */
    private Integer isDeleted;
}
