package com.java.CollectionExamples;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class CMException {


        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

            Iterator<Integer> iterator = numbers.iterator();

            try {
                while (iterator.hasNext()) {
                    Integer number = iterator.next();
                    System.out.println(number);


                    if (number == 3) {
                        iterator.remove();
                    }
                }
            } catch (ConcurrentModificationException ex) {
                System.out.println("ConcurrentModificationException occurred!");

            }

            System.out.println(numbers);
        }
    }


