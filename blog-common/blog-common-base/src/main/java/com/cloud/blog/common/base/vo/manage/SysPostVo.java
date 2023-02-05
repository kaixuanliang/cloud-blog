package com.cloud.blog.common.base.vo.manage;

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
public class SysPostVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位ID
     */
    private Long id;

    /**
     * 岗位编码
     */
    private String postCode;

    /**
     * 岗位名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态（1正常 0停用）
     */
    private Boolean status;

    private Date createTime;

    private Date updateTime;

    /**
     * 删除标记（0:可用 1:已删除）
     */
    private Boolean isDeleted;
}
