package me.nutsjian.springboot.newbie.dto;

/**
 * 错误码表.
 */

public enum Code {
    // 1024以内, 同HTTP
    SUCCESS(200, "success"),
    ERROR(500, "error"),

    PERMISSION_DENIED(403, "没有权限"),
    BAD_REQUEST(400, "错误的请求"),
    ACCOUNT_FORBIDDEN(10000,"账号被禁用"),

    ;

    private int code;
    private String message;

    Code(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
