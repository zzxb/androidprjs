package me.zzxb.pullrefreshdemo2.helper;

import java.util.List;

/**
 * Created by zzxb on 17/6/18.
 */

public class JSONResObj {
    private String status;
    private String msg;
    private List<Product> data;

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

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }
}
