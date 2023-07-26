package com.java.CollectionExamples;
import java.util.*;
public class EmployeeTypeArray {

    public static class Employee {
       String name;
        private int age;
        private int salary;



//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        public int getSalary() {
//            return salary;
//        }
//
//        public void setSalary(int salary) {
//            this.salary = salary;
//        }

        Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }
    }
    }



class  Employee2 extends EmployeeTypeArray{
    public static void main(String[] args) {
        Employee[] myemp = new Employee[3];
        myemp[0]= new Employee("ram",15,12333);
        myemp[0]= new Employee("hari",17,5633);
        myemp[0]= new Employee("sita",18,17333);


        System.out.println(myemp[0].toString());

        }
    }

