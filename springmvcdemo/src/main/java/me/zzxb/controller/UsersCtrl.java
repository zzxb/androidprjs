package me.zzxb.controller;

import me.zzxb.pojo.Users;
import me.zzxb.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zzxb on 17/5/24.
 */

@Controller
@RequestMapping("/")
public class UsersCtrl {

    @Autowired
    private UsersService usersService;


    @RequestMapping(value = "/cxuser/{uname}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> cxUsersFromUName(@PathVariable String uname){
        Users myUser = usersService.findByUName(uname);
        Map<String,Object> data = new HashMap<>();
        data.put("status","200");
        data.put("data",myUser);
        return data;
    }

    @RequestMapping(value = "/tjuser/{uname}/{upwd}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> tjUsers(@PathVariable String uname,@PathVariable String upwd){
        boolean isFlag = usersService.addUsers(uname,upwd);
        Map<String,Object> data = new HashMap<>();
        data.put("status","200");
        data.put("msg","添加成功！");
        return data;
    }


}
