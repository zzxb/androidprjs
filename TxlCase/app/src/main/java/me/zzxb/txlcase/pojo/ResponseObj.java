package me.zzxb.txlcase.pojo;

import java.io.Serializable;

/**
 * Created by zzxb on 17/5/31.
 */

public class ResponseObj implements Serializable{
    private String status = "";
    private String msg = "";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
