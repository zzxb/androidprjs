package me.zzxb.myskshop.pojo;

import java.util.List;

/**
 * Created by zzxb on 17/6/14.
 */

public class ResObj2 {
    private String status;
    private String msg;
    private List<ResCategory> data;

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

    public List<ResCategory> getData() {
        return data;
    }

    public void setData(List<ResCategory> data) {
        this.data = data;
    }
}
