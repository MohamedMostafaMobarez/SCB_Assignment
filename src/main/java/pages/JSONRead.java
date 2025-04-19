package pages;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class JSONRead {

    public void

    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {

        //object of JSONParser
        JSONParser j = new JSONParser();

        // load json file to be read
        FileReader f = new FileReader("C:\\Users\\USER\\Desktop\\Mohamed\\Selenium\\SCB_Assignment\\src\\main\\resources\\Data.json");


        // parse json content
        Object o = j.parse(f);

        // convert parsing object to JSON object
        JSONObject data = (JSONObject)o;

        // get values from JSON file
        //String name = (String)data.get("name");
        String email = (String)data.get("email");
        System.out.println("First name:" + name);
        System.out.println("Email" + email);




    }

    public CharSequence getString(String name) {
        String name = (String)data.get("name");
    }
}
