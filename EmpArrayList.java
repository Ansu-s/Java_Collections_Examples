package com.java.CollectionExamples;
import java.util.ArrayList;
public class EmpArrayList {


    class Employee {
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
    }

    public class Employee1 {
        public void main(String[] args) {

            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee("ram", 14));
            employees.add(new Employee("hari", 42));
            employees.add(new Employee("sita", 34));

            String searchName = "sita";
            Employee foundEmp = searchname(employees, searchName);

            if (foundEmp != null) {
                System.out.println("Employee found: " + foundEmp.getName() + " (ID: " + foundEmp.getId() + ")");
            } else {
                System.out.println("Employee not found.");
            }
        }

        public static Employee searchname(ArrayList<Employee> employees, String name) {
            for (Employee employee : employees) {
                if (employee.getName().equals(name)) {
                    return employee;
                }
            }
            return null;
        }
    }

}
