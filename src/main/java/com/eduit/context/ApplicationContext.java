package com.eduit.context;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {

    private static ApplicationContext instance;
    private Map<String,Object> objects;

    private ApplicationContext() {
      objects = new HashMap<>();
    }

    public void add(String name , Object o){
        objects.put(name,o);
    }

    public Object get (String name){
        return objects.get(name);
    }

    public static ApplicationContext instance(){
        if(instance == null){
            instance = new ApplicationContext();
        }
        return instance;
    }


}
