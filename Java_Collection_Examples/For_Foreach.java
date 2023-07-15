package com.java.CollectionExamples;
import java.util.ArrayList;
public class For_Foreach {



        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);


            for (int i = 0; i < numbers.size(); i++) {
                int number = numbers.get(i);
                System.out.println(number);
            }


            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }


