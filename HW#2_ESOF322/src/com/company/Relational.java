package com.company;
import java.io.IOException;
import java.util.Scanner;

    public class Relational extends Database {
        public void relational() {
            System.out.println("Type in new data to store or press 0 to choose a different software");
            Scanner scan = new Scanner(System.in); //scan integer input and call store method if != 0
            int i = scan.nextInt( );
            System.out.println("You chose: " + i);
            if (i == 0) {
                System.out.println("Choose your new algorithm strategy\n" +
                        "Press 1 for tableStore(); \n" +
                        "Press 2 for documentStore(); \n" +
                        "Press 3 for nodeStore(); \n");
                int n = scan.nextInt( );
                System.out.println("You chose: " + n);


            } else {
                try {
                    tableStore(); // call tablestore in Database
                } catch (IOException e) {
                    e.printStackTrace( );
                }

            }
        }
    }
