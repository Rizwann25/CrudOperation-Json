package com.test.atmecs.test;

import com.test.atmecs.helper.Helper;
import com.test.atmecs.json.JSONReader;

import java.util.Scanner;

public class JsonCrudOperation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int choice;

        do
        {
            System.out.println("Help JSON Reader/Writers : ");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Print Employee");
            System.out.println("0. Exit");

            System.out.println("Choose any one : ");
            choice = scan.nextInt();

            System.out.println("\n");

            switch(choice)
            {
                case 1 : System.out.println("Add Employee :\n");
                    Helper.addEmployee();
                    Helper.printEmployee();
                    break;

                case 2 : System.out.println("Update Employee :\n");

                    break;

                case 3 : System.out.println("Delete Employee :\n");
                    Helper.deleteEmployee();
                    Helper.printEmployee();
                    break;

                case 4 : System.out.println("Print Employee :\n");
                    Helper.printEmployee();
                    break;

                case 0 :
                    System.exit(0);
                    break;
                default: System.out.println("Try again with other options :");
            }
        }while(choice != 0);
    }
}
