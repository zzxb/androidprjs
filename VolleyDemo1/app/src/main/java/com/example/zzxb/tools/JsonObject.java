package com.example.zzxb.tools;

import java.util.List;

/**
 * Created by zzxb on 17/5/28.
 */

public class JsonObject {
    private String status;
    private String msg;
    private List<Users> data;
    private List<Txl> data2;

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

    public List<Users> getData() {
        return data;
    }

    public void setData(List<Users> data) {
        this.data = data;
    }

    public List<Txl> getData2() {
        return data2;
    }

    public void setData2(List<Txl> data2) {
        this.data2 = data2;
    }
}
