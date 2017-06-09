package me.zzxb.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by zzxb on 17/5/24.
 */
@Entity
public class Txls {
    private int txlid;
    private String lxrname;
    private String lxrtel;
    private Timestamp addtime;
    private String timage;
    private Users usersByUserid;


    public String getTimage() {
        return timage;
    }

    public void setTimage(String timage) {
        this.timage = timage;
    }

    public Txls() {
    }

    public Txls(String lxrname, String lxrtel) {
        this.lxrname = lxrname;
        this.lxrtel = lxrtel;
    }

    @Id
    @Column(name = "txlid", nullable = false)
    public int getTxlid() {
        return txlid;
    }

    public void setTxlid(int txlid) {
        this.txlid = txlid;
    }

    @Basic
    @Column(name = "lxrname", nullable = false, length = 20)
    public String getLxrname() {
        return lxrname;
    }

    public void setLxrname(String lxrname) {
        this.lxrname = lxrname;
    }

    @Basic
    @Column(name = "lxrtel", nullable = false, length = 20)
    public String getLxrtel() {
        return lxrtel;
    }

    public void setLxrtel(String lxrtel) {
        this.lxrtel = lxrtel;
    }

    @Basic
    @Column(name = "addtime", nullable = false)
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

        Txls txls = (Txls) o;

        if (txlid != txls.txlid) return false;
        if (lxrname != null ? !lxrname.equals(txls.lxrname) : txls.lxrname != null) return false;
        if (lxrtel != null ? !lxrtel.equals(txls.lxrtel) : txls.lxrtel != null) return false;
        if (addtime != null ? !addtime.equals(txls.addtime) : txls.addtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = txlid;
        result = 31 * result + (lxrname != null ? lxrname.hashCode() : 0);
        result = 31 * result + (lxrtel != null ? lxrtel.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false)
    public Users getUsersByUserid() {
        return usersByUserid;
    }

    public void setUsersByUserid(Users usersByUserid) {
        this.usersByUserid = usersByUserid;
    }
}
