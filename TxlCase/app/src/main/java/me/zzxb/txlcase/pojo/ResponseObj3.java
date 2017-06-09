package me.zzxb.txlcase.pojo;

import java.util.List;

/**
 * Created by zzxb on 17/6/5.
 */

public class ResponseObj3 {
    private String status = "";
    private String msg = "";
    private List<ResLxr> data = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ResLxr> getData() {
        return data;
    }

    public void setData(List<ResLxr> data) {
        this.data = data;
    }
}
