package com.test.atmecs.helper;

import com.test.atmecs.json.JSONReader;
import com.test.atmecs.json.JSONWriter;
import com.test.atmecs.model.Address;
import com.test.atmecs.model.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Scanner;

public class Helper {

    public static void addEmployee(){
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of employee\n");
        employee.setId(scanner.nextInt());
        System.out.println("Enter the Name of employee\n");
        employee.setName(scanner.next());
        employee.setPermanent(true);
        System.out.println("Enter the Phone Number of employee\n");
        employee.setPhoneNumber(scanner.next());
        System.out.println("Enter the Role of employee\n");
        employee.setRole(scanner.next());

        Address address = new Address();
        System.out.println("Enter the Street address\n");
        address.setStreet(scanner.next());
        System.out.println("Enter the City\n");
        address.setCity(scanner.next());
        System.out.println("Enter the ZipCode\n");
        address.setZipCode(scanner.next());

        employee.setAddress(address);
        new JSONWriter().addEmployeeToEmployeeFile(employee);
    }

    public static void deleteEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of an employee to delete:\n");
        long id = scanner.nextLong();
        JSONArray employeeJSONArray = new JSONReader().readEmployeeJSONFile();
        for (int i=0; i<employeeJSONArray.size(); i++) {
            JSONObject employeeObject = (JSONObject) employeeJSONArray.get(i);
            if((long)employeeObject.get("id") == id){
                employeeJSONArray.remove(employeeObject);
            }
        }
        new JSONWriter().addEmployeeArrayToEmployeeFile(employeeJSONArray);

    }

    public static void updateEmployee(){
    }

    public static void printEmployee(){
        System.out.println(new JSONReader().readEmployeeJSONFile());
    }
}
