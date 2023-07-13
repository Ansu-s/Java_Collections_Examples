package com.java.CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
    public static void main (String[] args) {
        List<String> fixedList = new ArrayList<String>();
        fixedList.add("Hello");
        fixedList.add("Java");
        fixedList.add("World");
        fixedList = Collections.unmodifiableList(fixedList);
        // or List <String> fixedlist = Collections.unmodifiableList(fixedList);
// any attempt in modification will generat an exception ->Exception in thread "main" java.lang.UnsupportedOperationException
        //fixedList.add("hello");
        for (String s : fixedList) {
            System.out.print(s + " ");
        }

    }
    }
