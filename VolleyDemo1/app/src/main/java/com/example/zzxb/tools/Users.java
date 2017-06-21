package com.example.zzxb.tools;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zzxb on 17/5/30.
 */

public class Users implements Serializable{
    private int userid;
    private String uname;
    private String upwd;
    private String addtime;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }
}
