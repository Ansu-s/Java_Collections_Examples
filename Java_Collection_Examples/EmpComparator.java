package com.java.CollectionExamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class EmpComparator {


    static class Employee implements Comparable<Employee> {
        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        @Override
        public int compareTo(Employee other) {

            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return "Employee [name=" + name + ", id=" + id + "]";
        }
    }

    public static class EmployeeSortingExample {
        public static void main(String[] args) {

            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Alice", 101));
            employees.add(new Employee("Bob", 102));
            employees.add(new Employee("Charlie", 103));


            Collections.sort(employees);
            System.out.println("Sorted list using Comparable:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }


            Comparator<Employee> idComparator = Comparator.comparingInt(Employee::getId);
            Collections.sort(employees, idComparator);
            System.out.println("Sorted list using Comparator (by ID):");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

}
