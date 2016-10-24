package com.ironyard.data;

import java.util.*;

/**
 * Created by nathanielellsworth on 10/18/16.
 */
public class Main {

    public static void main(String[] args) {

        // (.1
        firstlast6v1();
        firstlast6v2();
        firstlast6v3();

        // (.2
        sameFirstLastv1();
        sameFirstLastv2();
        sameFirstLastv3();

        // (.3
        rotateLeft3v1();
        rotateLeft3v2();
        rotateLeft3v3();

        // (.4
        reverse3v1();
        reverse3v2();
        reverse3v3();

        // (.5
        sumFirstPenultimatev1();
        sumFirstPenultimatev2();
        sumFirstPenultimatev3();
        sumFirstPenultimatev4();

        // (.6
        mapBullyv1();
        mapBullyv2();
        mapBullyv3();

        // (.7
        mapSharev1();
        mapSharev2();
        mapSharev3();

        // (.8
        mapABv1();
        mapABv2();
        mapABv3();

        // (.9
        wordLenv1();
        wordLenv2();
        wordLenv3();

        // (.10
        indexWordsv1();
        indexWordsv2();
        indexWordsv3();
        indexWordsv4();
    }


    // (.1
    private static void firstlast6v1() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(6);
        boolean result = kata.firstLast6(myList);
        System.out.println("");
        System.out.printf("firstLast6(%s) -> %s\n", myList, result);
        System.out.println("");
    }
    private static void firstlast6v2() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(6);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        boolean result = kata.firstLast6(myList);
        System.out.printf("firstLast6(%s) -> %s\n", myList, result);
        System.out.println("");
    }
    private static void firstlast6v3() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(13);
        myList.add(6);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        boolean result = kata.firstLast6(myList);
        System.out.printf("firstLast6(%s) -> %s\n", myList, result);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }





    // (.2
    private static void sameFirstLastv1() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        boolean result = kata.sameFirstLast(myList);
        System.out.printf("firstLast6(%s) -> %s\n", myList, result);
        System.out.println("");
    }
    private static void sameFirstLastv2() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        boolean result = kata.sameFirstLast(myList);
        System.out.printf("firstLast6(%s) -> %s\n", myList, result);
        System.out.println("");
    }
    private static void sameFirstLastv3() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(1);
        boolean result = kata.sameFirstLast(myList);
        System.out.printf("firstLast6(%s) -> %s\n", myList, result);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }





    // (.3
    private static void rotateLeft3v1() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        kata.rotateLeft3(myList);
        System.out.println("sameFirstLast -> ("+myList+")");
        System.out.println("");
    }
    private static void rotateLeft3v2() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(11);
        myList.add(9);
        kata.rotateLeft3(myList);
        System.out.println("sameFirstLast -> ("+myList+")");
        System.out.println("");
    }
    private static void rotateLeft3v3() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(0);
        myList.add(0);
        kata.rotateLeft3(myList);
        System.out.println("sameFirstLast -> ("+myList+")");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }





    // (.4
    private static void reverse3v1() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        List<Integer> x = new ArrayList<Integer>(myList);
        Collections.reverse(myList);
        System.out.printf("reverse3(%s) -> %s\n", x, myList);
        System.out.println("");
    }
    private static void reverse3v2() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(11);
        myList.add(9);
        List<Integer> x = new ArrayList<Integer>(myList);
        Collections.reverse(myList);
        System.out.printf("reverse3(%s) -> %s\n", x, myList);
        System.out.println("");
    }
    private static void reverse3v3() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(0);
        myList.add(0);
        List<Integer> x = new ArrayList<Integer>(myList);
        Collections.reverse(myList);
        System.out.printf("reverse3(%s) -> %s\n", x, myList);
        System.out.println("");
        System.out.println("");
    }





    // (.5
    private static void sumFirstPenultimatev1() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        List<Integer> x = new ArrayList<Integer>(myList);
        int a = kata.sumFirstPenultimate(myList);
        System.out.printf("sumFirstPenultimate(%s) -> %s\n", x, a);
        System.out.println("");
    }
    private static void sumFirstPenultimatev2() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(1);
        List<Integer> x = new ArrayList<Integer>(myList);
        int a = kata.sumFirstPenultimate(myList);
        System.out.printf("sumFirstPenultimate(%s) -> %s\n", x, a);
        System.out.println("");
    }
    private static void sumFirstPenultimatev3() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        List<Integer> x = new ArrayList<Integer>(myList);
        int a = kata.sumFirstPenultimate(myList);
        System.out.printf("sumFirstPenultimate(%s) -> %s\n", x, a);
        System.out.println("");
    }
    private static void sumFirstPenultimatev4() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        List<Integer> x = new ArrayList<Integer>(myList);
        int a = kata.sumFirstPenultimate(myList);
        System.out.printf("sumFirstPenultimate(%s) -> %s\n", x, a);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }





    // (.6      //having a little trouble here :/ all my hash functions are '=' not ':'
    private static void mapBullyv1() {
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "candy");
        data.put("b", "dirt");
        Object x = data.clone();
        kata.mapBully(data);
        System.out.printf("mapBully(%s) -> %s\n", x, data);
        System.out.println("");
    }
    private static void mapBullyv2() {
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "candy");
        data.put("a", "candy");
        Object x = data.clone();
        kata.mapBully(data);
        System.out.printf("mapBully(%s) -> %s\n", x, data);
        System.out.println("");
    }
    private static void mapBullyv3() {
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "carrot");
        data.put("c", "meh");
        data.put("a", "candy");
        Object x = data.clone();
        kata.mapBully(data);
        System.out.printf("mapBully(%s) -> %s\n", x, data);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }





    // (.7
    private static void mapSharev1() {
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "bbb");
        data.put("c", "ccc");
        data.put("a", "aaa");
        Object x = data.clone();
        kata.mapShare(data);
        System.out.printf("mapShare(%s) -> %s\n", x, data);
        System.out.println("");
    }
    private static void mapSharev2() {
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "xyz");
        data.put("c", "ccc");
        Object x = data.clone();
        kata.mapShare(data);
        System.out.printf("mapShare(%s) -> %s\n", x, data);
        System.out.println("");
    }
    private static void mapSharev3() {
        HashMap<String, String> data = new HashMap<>();
        data.put("d", "hi");
        data.put("c", "meh");
        data.put("a", "aaa");
        Object x = data.clone();
        kata.mapShare(data);
        System.out.printf("mapShare(%s) -> %s\n", x, data);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }





    // (.8
    private static void mapABv1() {
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "There");
        data.put("a", "Hi");
        Object x = data.clone();
        kata.mapAB(data);
        System.out.printf("mapAB(%s) -> %s\n", x, data);
        System.out.println("");
    }
    private static void mapABv2() {
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "Hi");
        Object x = data.clone();
        kata.mapAB(data);
        System.out.printf("mapAB(%s) -> %s\n", x, data);
        System.out.println("");
    }
    private static void mapABv3() {
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "There");
        Object x = data.clone();
        kata.mapAB(data);
        System.out.printf("mapAB(%s) -> %s\n", x, data);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }


        //VVVVVV   Need help with these last two    VVVVVVV


    // (.9
    private static void wordLenv1() {
        ArrayList<String> data = new ArrayList<>();
        data.add("this");
        data.add("is");
        data.add("hard");
        data.add("ouch");
        Object x = data.clone();
        kata.wordLen(data);
        System.out.printf("wordLen(%s) -> %s\n", x, data);
    }




    private static void wordLenv2() {
        ArrayList<String> data = new ArrayList<>();
        data.add("this");
        data.add("that");
        data.add("this");
        data.add("that");
        Object x = data.clone();
        kata.wordLen(data);
        System.out.printf("wordLen(%s) -> %s\n", x, data);
    }




    private static void wordLenv3() {
        ArrayList<String> data = new ArrayList<>();
        data.add("a");
        data.add("dd");
        data.add("a");
        data.add("bb");
        Object x = data.clone();
        kata.wordLen(data);
        System.out.printf("wordLen(%s) -> %s\n", x, data);
    }







    private static void indexWordsv1(){
        String[] tmp = new String[]{"aardvark", "apple", "zamboni", "phone"};
        String[] saved = tmp.clone();

        Map<String, String> map =kata.indexWords(tmp);
        System.out.println("IndexWords(\"" + Arrays.toString(saved) + "\") -> (\""+(map)+"\")");
    }

    

}

