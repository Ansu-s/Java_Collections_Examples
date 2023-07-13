package com.java.CollectionExamples;

import java.util.*;
// vector is thread safe
// It only allows  one thread at a time
public class VectorArrayList {

        public static void main (String[] args)
        {

            ArrayList<String> list1 = new ArrayList<String>();


            list1.add("a");
            list1.add("b");
            list1.add("c");
            list1.add("d");

            System.out.println("ArrayList elements are:");
            Iterator<String> it = list1.iterator();
            while (it.hasNext())
                System.out.println(it.next());


            Vector<String> v = new Vector<String>();
            v.addElement("V1");
            v.addElement("V2");
            v.addElement("V3");

            System.out.println("Vector elements are:");
            Iterator<String> itr = v.iterator();
            while (itr.hasNext())
                System.out.println(itr.next());

            System.out.println("\nVector elements are:");
//            Enumeration e = v.elements();
//            while (e.hasMoreElements())        //intorduced in java 1.0 first cursor
//            System.out.println(.nextElement());
        }
    }

