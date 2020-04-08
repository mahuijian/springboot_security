package com.mhj.util;

/**
 * @author mahuijian
 * @since 2020/4/8 16:08
 */
public class ResponseObject<T> {
    private static final Integer SUCCESS = 200;

    private Integer status;
    private String message;
    private T data;

    public ResponseObject() {
    }

    public ResponseObject(Integer status, String message) {
        this.data = data;
        this.message = message;
    }

    public ResponseObject(Integer status, T data) {
        this.data = data;
        this.status = status;
    }

    public ResponseObject(Integer status, String message, T data) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public static <S> ResponseObject<S> success() {
        return new ResponseObject<>(SUCCESS, "success");
    }

    public static <S> ResponseObject<S> success(S data) {
        return new ResponseObject<>(SUCCESS, "success", data);
    }

    public static <S> ResponseObject<S> fail(Integer status, String message, S payload) {
        return new ResponseObject<>(status, message, payload);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
