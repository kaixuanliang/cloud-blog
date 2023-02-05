package com.cloud.blog.common.base.dto.manage;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 角色菜单
 * </p>
 *
 * @author lkx
 * @since 2023-02-02 16:58:57
 */
@Getter
@Setter
@Accessors(chain = true)
public class SysRoleMenuDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long roleId;

    private Long menuId;

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
