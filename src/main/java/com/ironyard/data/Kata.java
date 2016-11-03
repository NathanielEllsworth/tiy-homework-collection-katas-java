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
    public static Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if (map.get(str) == null){
                map.put(str, str.length());
            }
        }
        return map;
    }






    // (.10
    public static Map indexwords(List<String> z) {

        Map<String, List> wordsMap =  new HashMap<>();

        for (int i= 0; i < z.size(); i++){

            if (z.get(i).isEmpty()) continue;
          //  if (z.get(i).contains("\"")) z.remove(i);   //<<<<<<<<<<<<<<<<<<<<<<<<<< No Idea.

            String ourkey = String.valueOf(z.get(i).charAt(0));
            String ourvalue =  z.get(i).toString();

            if (wordsMap.containsKey(ourkey)) {
                List myWordsList = wordsMap.get(ourkey);
                myWordsList.add(ourvalue);
                wordsMap.put(ourkey, myWordsList);
            }
            else  {
                List myWordsList = new ArrayList();
                myWordsList.add(ourvalue);
                wordsMap.put(ourkey, myWordsList);
            }

        }
        return wordsMap;
    }
}
