package me.zzxb.listviewdemo;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by zzxb on 17/2/16.
 */

public class MapSerializable implements Serializable {
    private Map<String,Object> map = null;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
