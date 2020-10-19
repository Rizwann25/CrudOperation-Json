package com.test.atmecs.json;

import com.test.atmecs.constant.Constant;
import com.test.atmecs.model.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONWriter {

    public JSONArray addEmployeeToEmployeeFile(Employee employee) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(Constant.EmployeeFilePath)) {
            //Write JSON file
            JSONObject employeeJSON = new JSONObject();
            employeeJSON.put("id", employee.getId());
            employeeJSON.put("name", employee.getName());
            employeeJSON.put("permanent", employee.getPermanent());
            employeeJSON.put("phoneNumbers", employee.getPhoneNumber());
            employeeJSON.put("role",employee.getRole());

            JSONObject addressJSON = new JSONObject();
            addressJSON.put("street", employee.getAddress().getStreet());
            addressJSON.put("city", employee.getAddress().getCity());
            addressJSON.put("zipcode", employee.getAddress().getZipCode());

            employeeJSON.put("address", addressJSON);

            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj;
            employeeList.add(employeeJSON);

            BufferedWriter writer = Files.newBufferedWriter(Paths.get(Constant.EmployeeFilePath));
            writer.write(employeeList.toJSONString());
            writer.close();

            return employeeList;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONArray addEmployeeArrayToEmployeeFile(JSONArray employee) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(Constant.EmployeeFilePath)) {
            //Write JSON file

            BufferedWriter writer = Files.newBufferedWriter(Paths.get(Constant.EmployeeFilePath));
            writer.write(employee.toJSONString());
            writer.close();

            return employee;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
