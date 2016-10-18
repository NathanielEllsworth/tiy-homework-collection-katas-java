package com.ironyard.data;

import java.util.List;

/**
 * Created by nathanielellsworth on 10/18/16.
 */
public class kata {
    public static boolean firstLast6(List<Integer> x) {
        x.get(0); // To get first
        x.get(x.size()-1); //to get last
        if(!(6==0 || 6==x.size()-1)){

    return true;}
        else {
            return false;
        }
   }

}
