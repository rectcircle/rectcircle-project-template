package cn.rectcircle.commontemplate.dto;

import java.io.Serializable;

/**
 * @param <T> Data type
 * @author Rectcircle
 */
public class ResponseDTO<T> implements Serializable {

    private static final long serialVersionUID = 2527014820835783586L;

    private Integer code;

    private String msg;

    private T data;

    private String stackTrack;

    public static <T> ResponseDTO<T> success(T data) {
        return new ResponseDTO<>(0, "success", data);
    }

    public static ResponseDTO<?> success() {
        return new ResponseDTO<>(0, "success", null);
    }

    public static <T> ResponseDTO<T> failure(String msg) {
        return new ResponseDTO<>(-1, msg, null);
    }

    public ResponseDTO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStackTrack() {
        return stackTrack;
    }

    public void setStackTrack(String stackTrack) {
        this.stackTrack = stackTrack;
    }

    @Override
    public String toString() {
        return "ResponseDTO [code=" + code + ", data=" + data + ", msg=" + msg + ", stackTrack=" + stackTrack + "]";
    }
}
