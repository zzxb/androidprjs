package me.zzxb.txlcase.pojo;

import java.util.List;

/**
 * Created by zzxb on 17/6/5.
 */

public class ResponseObj2 {
    private String status = "";

    private List<ResUsers> data = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResUsers> getData() {
        return data;
    }

    public void setData(List<ResUsers> data) {
        this.data = data;
    }
}
