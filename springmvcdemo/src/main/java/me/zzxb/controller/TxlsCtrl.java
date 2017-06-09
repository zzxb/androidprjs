package me.zzxb.controller;

import me.zzxb.pojo.Txls;
import me.zzxb.service.TxlsService;
import me.zzxb.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zzxb on 17/5/24.
 */
@Controller
@RequestMapping("/")
public class TxlsCtrl {

    @Autowired
    private TxlsService txlsService;
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/tjlxr/{uname}/{lxrname}/{lxrtel}" ,method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> tjlxr(@PathVariable String uname,@PathVariable String lxrname,@PathVariable String lxrtel){
        Txls lxr = new Txls(lxrname,lxrtel);
        boolean flag = txlsService.addLxr(uname,lxr);
        Map<String,Object> data = new HashMap<>();
        data.put("status","200");
        data.put("msg","成功了！");
        return data;
    }

    @RequestMapping(value = "/cxalllxr/{uname}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> cxlxrs(@PathVariable String uname){
        List<Txls> data = usersService.findByAllLxrFromUName(uname);
        Map<String,Object> response = new HashMap<>();
        response.put("status","200");
        response.put("msg","成功了!");
        response.put("data",data);
        return response;
    }
}
