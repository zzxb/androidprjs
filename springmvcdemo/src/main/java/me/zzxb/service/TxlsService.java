package me.zzxb.service;

import me.zzxb.pojo.Txls;
import me.zzxb.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zzxb on 17/5/24.
 */
@Service
public class TxlsService {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Autowired
    private UsersService usersService;

    public boolean addLxr(String uname, Txls lxr){
        Users myUser = usersService.findByUName(uname);
        lxr.setUsersByUserid(myUser);
        hibernateTemplate.save(lxr);
        return true;
    }

}
