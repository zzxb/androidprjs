package me.zzxb.myskshop.pojo;

import java.util.List;

/**
 * Created by zzxb on 17/6/12.
 */

public class ResObj {
    private String status;
    private String msg;
    private List<ResProduct> data;

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

    public List<ResProduct> getData() {
        return data;
    }

    public void setData(List<ResProduct> data) {
        this.data = data;
    }
}
