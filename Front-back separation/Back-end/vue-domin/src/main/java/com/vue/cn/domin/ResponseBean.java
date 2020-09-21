package com.vue.cn.domin;

public class ResponseBean extends StatusResponse {

    private Object data;

    public ResponseBean(StatusEnum statusEnum,Object data) {
        super(statusEnum);
        this.data=data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
