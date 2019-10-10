package com.company;
//Andrew Cilker and Olivia Fewell
//CHECK PG. 109-125
//we will recognise "UnlimitedNatural" as type double

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

        public class Company {
            public String name;
            public Address headquarters;
            public Employee employee;
            public Customer customer;
            public VehicleRentalService service = new VehicleRentalService();
            public Truck truck;
            public Motorbike motorbike;
            public Car car;
        }

        public class Truck extends Vehicle {
            private String manufacturer;
            private double power;
            private double weight;
            private String regNo;
        }

        public class Car extends Vehicle {//CarKind recognized as string
            private String kind;
            private int noSeats;
            private double power;
            private String manufactuer;
            private String regNo;
        }

        public abstract class Vehicle implements Rentable {

        }

        public class Motorbike extends Vehicle {//MbKind recognized as string
            private String kind;
            private double cylinderCap;
            private double power;
            private String manufacturer;
            private String regNo;
        }

        public interface Rentable {
            rent();

        }

        public class Person {
            private String name;
            private String email;
        }

        public class BankAccount {
            private double number;
            private String depositor;
            private String bank;
        }

        public class Service {
            private Customer customer;
        }

        public class Employee extends Person {

        }

        public class Customer extends Person {
            public BankAccount bankAccount = new BankAccount();
        }

        public class Subcontractor extends Employee extends Customer {
            // I recognize that this doesnt work in Java but I'll put it for the pseudocode
        }

        public class VehicleRentalService extends Service {
            private Vehicle vehicle;

            offerCar() {
            }

            offerMotorbike() {
            }

            offerTruck() {
            }
        }

        public class Address {
            private String street;
            private String postalCode;
            private String city;
        }

}
