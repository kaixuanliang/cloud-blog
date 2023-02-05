package com.cloud.blog.common.base.result;

import lombok.Getter;

/**
 * @author: lkx
 * @since: 20002003/200/5 10:2005
 * @description:响应code，枚举类
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(20000,"成功"),
    FAIL(20001, "失败"),
    SERVICE_ERROR(20001200, "服务异常"),
    DATA_ERROR(20004, "数据异常"),
    ILLEGAL_REQUEST(20005, "非法请求"),
    REPEAT_SUBMIT(20006, "重复提交"),
    ARGUMENT_VALID_ERROR(20010, "参数校验异常"),

    LOGIN_AUTH(20008, "未登陆"),
    PERMISSION(20009, "没有权限"),
    ACCOUNT_ERROR(20014, "账号不正确"),
    PASSWORD_ERROR(20015, "密码不正确"),
    LOGIN_MOBLE_ERROR( 20016, "账号不正确"),
    ACCOUNT_STOP( 20017, "账号已停用"),
    NODE_ERROR( 20018, "该节点下有子节点，不可以删除")
    ;

    Integer code;
    String message;
    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
