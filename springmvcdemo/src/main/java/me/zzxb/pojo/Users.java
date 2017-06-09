package me.zzxb.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by zzxb on 17/5/24.
 */
@Entity
public class Users {
    private int userid;
    private String uname;
    private String upwd;
    private Timestamp addtime;
    private Collection<Txls> txlsByUserid;

    public Users(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

    public Users() {
    }

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


    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userid != users.userid) return false;
        if (uname != null ? !uname.equals(users.uname) : users.uname != null) return false;
        if (upwd != null ? !upwd.equals(users.upwd) : users.upwd != null) return false;
        if (addtime != null ? !addtime.equals(users.addtime) : users.addtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (upwd != null ? upwd.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }

    public Collection<Txls> getTxlsByUserid() {
        return txlsByUserid;
    }

    public void setTxlsByUserid(Collection<Txls> txlsByUserid) {
        this.txlsByUserid = txlsByUserid;
    }
}
