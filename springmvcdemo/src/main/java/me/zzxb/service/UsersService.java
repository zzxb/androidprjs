package me.zzxb.service;

import me.zzxb.pojo.Txls;
import me.zzxb.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zzxb on 17/5/24.
 */
@Service
public class UsersService {

    @Autowired
    HibernateTemplate hibernateTemplate;

    public Users findByUName(String uName){
        String hsql = "select u from Users u where u.uname = ?";
        List<Users> data = (List<Users>)hibernateTemplate.find(hsql,uName);
        return data.get(0);
    }

    public boolean addUsers(String uName,String uPwd){
        Users myUser = new Users(uName,uPwd);
        hibernateTemplate.save(myUser);
        return true;
    }

    public List<Txls> findByAllLxrFromUName(String uName){

        String hsql = "select txl from Users u inner join u.txlsByUserid txl where u.uname = ?";
        List<Txls> data = (List<Txls>)hibernateTemplate.find(hsql,uName);
        return data;
    }


}
