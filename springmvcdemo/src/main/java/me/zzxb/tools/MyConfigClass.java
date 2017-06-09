package me.zzxb.tools;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 * Created by zzxb on 17/5/24.
 */
public class MyConfigClass extends ObjectMapper {

    public MyConfigClass() {
        registerModule(new Hibernate4Module());
    }
}
