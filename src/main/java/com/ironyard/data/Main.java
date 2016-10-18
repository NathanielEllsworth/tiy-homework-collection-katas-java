package com.ironyard.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nathanielellsworth on 10/18/16.
 */
public class Main {

    public static void main(String[] args) {
           firstlast6Example();
        firstlast6Example2();


        }
   private static void firstlast6Example() {
       List<Integer> myList = new ArrayList<Integer>();
       myList.add(1);
       myList.add(2);
       myList.add(6);
       boolean result = kata.firstLast6(myList);

       System.out.printf("firstLast6(%s) -> %s\n", myList, result);

   }

    private static void firstlast6Example2() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(6);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        boolean result = kata.firstLast6(myList);

        System.out.printf("firstLast6(%s) -> %s\n", myList, result);

    }
    private static void firstlast6Example3() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(6);
        myList.add(6);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        boolean result = kata.firstLast6(myList);

        System.out.printf("firstLast6(%s) -> %s\n", myList, result);

    }

}

