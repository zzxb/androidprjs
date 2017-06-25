package me.zzxb.pullrefreshdemo3.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzxb on 17/6/25.
 */

public class MyService {
    public static List<String> getData(int start){
        List<String> tmp = new ArrayList<>();
        for(int i = 0;i < 50;i++){
            tmp.add(""+i);
        }
        List<String> data = new ArrayList<>();
        if(start >= tmp.size()){
            return data;
        }
        for (int j = 0;j < 10;j++){
            data.add(tmp.get(start+j));
        }
        return data;
    }
}
