package com.it;

import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ObjectOutputStreamM {
    public static void main(String[] args) throws Exception {
      //  ObjectOutputStream o = new ObjectOutputStream();
        /*
        Map<String,String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/
        Map<String,String> map = new TreeMap<>(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        map.put("a","abstract");
        map.put("c","call");
        map.put("b","basic");
        map.put("T","tree");
        for(Map.Entry<String,String> kv:map.entrySet()){
            System.out.println(kv.getKey()+"="+kv.getValue()+" ");
        }
    }
}
