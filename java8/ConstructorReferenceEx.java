import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceEx {

    // Employee class with a parameterized constructor
    static class Employee {
        private String name;
        private String account;
        private double salary;

        // Parameterized constructor
        public Employee(String name, String account, double salary) {
            this.name = name;
            this.account = account;
            this.salary = salary;
        }

        // toString() to print employee details
        @Override
        public String toString() {
            return "Employee{name='" + name + "', account='" + account + "', salary=" + salary + "}";
        }
    }

    // Functional interface that takes 3 arguments and returns an Employee object
    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {
        // Using constructor reference to create an Employee object
        TriFunction<String, String, Double, Employee> employeeCreator = Employee::new;

        // Create an Employee object using constructor reference
        Employee employee = employeeCreator.apply("John Doe", "123456789", 75000.0);

        // Output the details of the created Employee object
        System.out.println(employee);
    }
}
