package com.ironyard.data;

import java.util.List;

/**
 * Created by nathanielellsworth on 10/18/16.
 */
public class kata {
    public static boolean firstLast6(List<Integer> x) {

        if(x.get(0) == 6 || x.get(x.size()-1) == 6){
            return true;
        }
        else {return false;
        }
   }

}
//collection.reverse