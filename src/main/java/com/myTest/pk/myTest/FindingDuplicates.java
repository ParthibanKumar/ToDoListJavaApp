package com.myTest.pk.myTest;


/*import java.util.ArrayList;
import java.util.List;
import java.util.Set;*/
import java.util.*;

public class FindingDuplicates {
    public static void main(String[] args) {

        int[] array = {1 ,2, 2, 3, 4, 5, 6, 6};

        List<Integer> duplicateVals = new ArrayList<>();
        Set<Integer> actualVal = new HashSet<>();

        for(int i=0; i<array.length; i++)
        {
            if(!actualVal.add(array[i]))
            {
                duplicateVals.add(array[i]);

            }
        }
        System.out.println("Duplicates Values are: " + duplicateVals);
    }
}



