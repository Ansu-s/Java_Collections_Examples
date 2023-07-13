package com.java.CollectionExamples;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindElementArrayList {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(5);
        mylist.add(6);
        mylist.add(56);
        mylist.add(7);
        mylist.add(2);
        System.out.println("Enter the element you want to find in the list :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (mylist.contains(a))
        System.out.println("Yes it exist");
        else
            System.out.println("No it dosen't exist");
    }
}
