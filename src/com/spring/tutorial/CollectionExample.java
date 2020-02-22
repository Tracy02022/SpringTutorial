package com.spring.tutorial;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

            List<Integer> integerList = new ArrayList<>();

            integerList.add(10);
            integerList.add(10);
            integerList.add(10);
            integerList.add(10);

            System.out.println(integerList);


            Map<String, String> map = new HashMap<>();

            ((HashMap) map).put("key1", "value1");
            ((HashMap) map).put("key2", "value2");
            ((HashMap) map).put("key3", "value3");
            ((HashMap) map).put("key4", "value4");

            Set<String> keySet = map.keySet();
            Iterator<String> iter = keySet.iterator();

            while (iter.hasNext()) {

                String key = iter.next();
                String value = map.get(key);

                System.out.println(" key is " + key + " value is " + value);
            }
    }

}
