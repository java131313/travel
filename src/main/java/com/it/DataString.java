package com.it;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class DataString {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>(new Comparator<String>() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            @Override
            public int compare(String o1, String o2) {
                try{
                    return sdf.parse(o1).compareTo(sdf.parse(o2));
                }catch (ParseException e){
                    e.printStackTrace();
                    return 0;
                }

            }
        });
        map.put("2016-7-3",100);
        map.put("2016-7-10",120);
        map.put("2016-8-1",90);
        for(Map.Entry<String,Integer> kv:map.entrySet()){
            System.out.println(kv.getKey()+","+kv.getValue());
        }
    }
}
