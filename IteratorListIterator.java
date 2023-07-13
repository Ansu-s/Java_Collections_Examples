package com.java.CollectionExamples;

import java.util.*;

public class IteratorListIterator {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        LinkedList<String> mylist = new LinkedList<String>();
        list1.add(4);
        list1.add(18);
        list1.add(8);
        list1.add(5);

        mylist.add("hello");
        mylist.add("world");
        mylist.add("java");

        Iterator<Integer> itr = list1.iterator();
        for (Integer ex : list1) System.out.println(" Elements are :" + ex);


        ListIterator<String> lstr = mylist.listIterator();


        while (lstr.hasNext()) {
            String item = lstr.next();
            System.out.println(item);
          }

     // reversing the listIterator as it is currently in the last position.

        while (lstr.hasPrevious()) {
            String item2 = lstr.previous();
            System.out.println(item2);
        }
        }
    }



