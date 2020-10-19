package com.test.atmecs.json;
import com.test.atmecs.constant.Constant;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JSONReader {

    public JSONArray readEmployeeJSONFile() {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(Constant.EmployeeFilePath)) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj;
            return employeeList;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
