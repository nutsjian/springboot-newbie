package me.nutsjian.springboot.newbie.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {
    public static Response<Void> SUCCESS = new Response<>(Code.SUCCESS);

    public static Response<Void> error(String message) {
        return new Response<>(Code.ERROR.getCode(), message, null);
    }

    public static <T>Response<T> ok(T data) {return new Response<T>(Code.SUCCESS, data);}

    private int code;

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public Response(T data) {
        this(Code.SUCCESS, data);
    }

    public Response(Code code) {
        this(code.getCode(), code.getMessage(), null);
    }

    public Response(Code code, String message) {this(code.getCode(), message, null);}

    public Response(Code code, T data) {
        this(code.getCode(), code.getMessage(), data);
    }

    public Response(int code, String message) {
        this(code, message, null);
    }

    public Response(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

//    @Override
//    public String toString() {
//        return Json.encode(this);
//    }
}
