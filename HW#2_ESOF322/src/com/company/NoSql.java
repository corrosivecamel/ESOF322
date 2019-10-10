package com.company;
import java.io.IOException;
import java.util.Scanner;

    class NoSQL extends Database{
        public void noSQL(){
        System.out.println("Type in new data to store or press 0 to choose a different software");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("You chose: " + i);
        if(i==0){
            System.out.println("Choose your new algorithm strategy\n" +
                    "Press 1 for tableStore(); \n" +
                    "Press 2 for documentStore(); \n" +
                    "Press 3 for nodeStore(); \n");
            int n = scan.nextInt();
            System.out.println("You chose: " + n);

        }else{
            System.out.println("Graph store algorithm success! :D");
            try {
                documentStore(); // Call docstore in database
            } catch (IOException e) {
                e.printStackTrace();
            }
            //store data to file by calling nodeStore();
        }
    }}


