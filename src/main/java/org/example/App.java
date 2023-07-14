package org.example;
import org.json.*;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        //System.out.println( "Hello World!" );
        Box <String> stringBox=new Box<String>();
        stringBox.setItem("Hello, World!");
        String message = stringBox.getItem();
        System.out.println(message);
        String jsonStr = "{\"name\":\"Alice\",\"age\":30,\"isStudent\":true,\"address\":{\"city\":\"New York\",\"state\":\"NY\"},\"hobbies\":[\"reading\",\"hiking\",\"traveling\"]}";
        JSONObject jsonObj = new JSONObject(jsonStr);
        Box<JSONObject> jsonObjectBox=new Box<JSONObject>();
        jsonObjectBox.setItem(jsonObj);
        JSONObject jsonObject1=jsonObjectBox.getItem();
        System.out.println(jsonObject1.get("name"));
    }
}
