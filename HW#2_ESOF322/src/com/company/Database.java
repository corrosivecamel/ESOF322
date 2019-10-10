package com.company;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.sql.Driver;

public abstract class Database { //implements Algorithms setStoreStrategy()
    public void relational(){}
    public void graph(){}
    public void noSQL(){}
        public void nodeStore() throws IOException {
            System.out.println("Type a string to tableStore");
            Scanner scan = new Scanner(System.in);
            String data2 = scan.nextLine();
            System.out.println("nodeStore() algorithm success! :D");
            FileWriter fw = new FileWriter( "text.txt");
            fw.write(data2);
            System.out.println("Data successfully stored");
            fw.close();
        }

        public void documentStore() throws IOException{
            System.out.println("Type a string to tableStore");
            Scanner scan = new Scanner(System.in);
            String data1 = scan.nextLine();
            System.out.println("documentStore() algorithm success! :D");
            FileWriter fw = new FileWriter( "text.txt");
            fw.write(data1);
            System.out.println("Data successfully stored");
            fw.close();
        }

        public  void tableStore() throws IOException{
            System.out.println("Type a string to tableStore");
            Scanner scan = new Scanner(System.in);
            String data = scan.nextLine();

            System.out.println("tableStore() algorithm success! :D");
            FileWriter fw = new FileWriter( "text.txt");
            fw.write(data);
            System.out.println("Data successfully stored");
            fw.close();
        }

    }


   /*
    Main.DBStrategy.store() // careful here
}

/* Database database = new Relational; */
