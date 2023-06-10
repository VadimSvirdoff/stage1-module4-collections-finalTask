package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>>  result = new HashMap();

        sourceMap.forEach((key, value) -> {
            HashSet<String> newValue = new HashSet();
            int keyLenght = key.length();


            sourceMap.forEach((innerKey, innerValue) -> {
                if(innerKey.length() == keyLenght){
                    newValue.add(innerKey);
                }
            });

            result.put(keyLenght, newValue);
        });

        return result;
    }
}
