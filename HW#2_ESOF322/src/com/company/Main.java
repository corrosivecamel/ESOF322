package com.company;
import java.util.Scanner;
//future reference consider looping menu system
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose your database software:\n" +
                "Press 0 to exit program \n" +
                "Press 1 for Relational DB\n"+
                "Press 2 for NoSQL \n"+
                "Press 3 for Graph \n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("You chose: "+n);
        if(n==0){
            System.exit(0); //terminate program
        }
        else if(n==1){
            Database database = new Relational(); // chooses relational
            database.relational();
        }else if(n==2){
            Database database = new NoSQL(); //NoSQL
            database.noSQL();
        }else if(n==3){
            Database database = new Graph();//Graph1
            database.graph();
        }else{
            System.out.println("Input Error");
        }
        scan.close();
    }
    }

