package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToArraylist {
    public static void main(String[] args) {

         // Converting an array to ArrayList using Arrays.asList(...)
        // always use wrapper classes for array declaration primitive data type lik int , byte ...are not allowed

        Integer a [] = {2, 7, 8, 0, 0,};
        Integer[] b = new Integer[5];


        for (int i = 0; i < b.length; i++) {

            System.out.print("Enter a value for element " + i + ": ");

            Scanner sc = new Scanner(System.in);
            b[i] = sc.nextInt();
        }

        List<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(b));
        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(a));


        System.out.println( "After conversion the ArrayList is "+arrayList1);
        System.out.println( "After conversion the ArrayList is "+arrayList);

    }
}
