package com.cmonkey.jdk11;

import java.util.*;

public class LocalVariableTypeInference {

    public static void main(String[] args) {
        var text = "Hello Jdk11";

        final var msg = "Hello jdk11";

        text = "23";

        var myList = new ArrayList<Integer>();

        for (var item: myList){
            System.out.println(item);
        }

        var list = List.of("A", "B", "C");

        var copy = List.copyOf(list);

        System.out.println(list == copy);

        var map = Map.of("A", "B", "B", "c", "C", "D");

        var copyMap = Map.copyOf(map);

        System.out.println(copyMap == map);

        var set = Set.of("A", "B", "C");

        var copySet = Set.copyOf(set);

        System.out.println(copySet == set);

        var mutableSet = new HashSet<String>();

        var copyMutableSet = Set.copyOf(mutableSet);

        System.out.println(copyMutableSet == mutableSet);

        var mutableList = new ArrayList<Integer>();

        mutableList.add(1);
        mutableList.add(2);
        mutableList.add(3);

        var copyMutableList = List.copyOf(mutableList);

        System.out.println(mutableList == copyMutableList);

        var mutableMap = new HashMap<String, Integer>();

        mutableMap.put("A", 1);
        mutableMap.put("B", 2);
        mutableMap.put("C", 3);

        var copyMutableMap = Map.copyOf(mutableMap);

        System.out.println(copyMutableMap == mutableMap);
    }
}
