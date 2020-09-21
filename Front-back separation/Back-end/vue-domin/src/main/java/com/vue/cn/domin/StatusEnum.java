package com.vue.cn.domin;

public enum StatusEnum {

    OK(20000,"操作成功"),
	ERROE(20002,"操作失败"),
    ;

    private int status;

    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    StatusEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
