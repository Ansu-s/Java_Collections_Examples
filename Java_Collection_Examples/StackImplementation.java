package com.java.CollectionExamples;
import java.util.Stack;
public class StackImplementation {



        public static void main(String[] args) {


            Stack<String> animalStack = new Stack<>();


            animalStack.push("Cat");
            animalStack.push("Dog");
            animalStack.push("Cat");
            animalStack.push("Mouse");
            System.out.println("Stack: " + animalStack);


            animalStack.pop();
            System.out.println("Stack after pop: " + animalStack);
        }
    }

