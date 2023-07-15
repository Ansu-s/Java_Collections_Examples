package com.java.CollectionExamples;
import java.util.*;
public class SynchronizedList {
//by using collections.synchronizedList (..)
        public static void main (String[] args) {
            List<String> synclist = new ArrayList<String>();
            synclist.add("Hello");
            synclist.add("Java");
            synclist.add("World");
            synclist = Collections.synchronizedList(synclist);
            // or List <String> synclist = Collections.synchronizedList(syncList);
            synchronized(synclist) {

                for (String s : synclist) {
                    System.out.print(s + " ");
                }

        }
    }
}
