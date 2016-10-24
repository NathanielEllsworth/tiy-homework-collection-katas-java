package com.ironyard.data;

import java.util.*;

/**
 * Created by nathanielellsworth on 10/18/16.
 */


public class kata {






    // (.1
    public static boolean firstLast6(List<Integer> x) {

        if(x.get(0) == 6 || x.get(x.size()-1) == 6){
            return true;
        } else{
            return false;
        }
    }





    // (.2
    public static boolean sameFirstLast(List<Integer> x) {

        if ((x.get(0) == x.get(x.size()-1) && x.get(0) == 1)){
            return true;
        }else{
            return false;
        }
    }





    // (.3
    public static void rotateLeft3(ArrayList<Integer> myList) {

        int g = myList.remove(0);
        myList.add(2,g);
    }





    // (.4
    // method in class Main





    // (.5
    public static int sumFirstPenultimate(List<Integer>myList) {

        int x = 0;
        if (myList.size() >= 2) {
            int firstElement = myList.get(0);
            int secondToLast = myList.get(myList.size() - 2);
            x = firstElement + secondToLast;
        }else{
            x =myList.get(0) + myList.get(1);
        }
        return x;
    }





    // (.6
    public static void mapBully(HashMap<String,String> data){

        String x = data.get("a");
        data.put("b", x);
        data.put("a", "\" \"");
    }





    // (.7
    public static Map mapShare(HashMap<String,String> data) {

        if (data.containsKey("a")) {
            String x = data.get("a");
            data.put("b", x);
        }
        data.remove("c");
        return data;
    }





    // (.8
    public static Map mapAB(HashMap<String,String> data){

        if (data.containsKey("a") && data.containsKey("b")) {
            String x = data.get("a") + data.get("b");
            data.put("ab", x);
        }
        return data;
    }





    // (.9
    public static Map<String, Integer> wordLen(ArrayList<String> strings) {

        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if (map.get(str) == null){
                map.put(str, str.length());
            }
        }
        return map;
    }






    // (.10
    public static HashMap<String, String> indexWords(String[] x) {

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            String key = String.valueOf(x[i].charAt(0));
            if (map.containsKey(key)) {
                String val = map.get(key) + x[i];
                map.put(key, val);
            } else {
                map.put(key, x[i]);
            }
        }return (HashMap<String, String>) map;
    }

}
//collection.reverse