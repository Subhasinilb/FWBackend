import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Backend
{
	public static void main(String args[]) throws JSONException
	{
		system.out.print("\n1.Create Key-Value Data Store\n2.Read from Data Store \n3.Delete Key-Value pair \n4.Exit\nEnter your option:");
		String Key = new String();
		


// create a data store with key and value

public static void create(String Key, JSONObject Value)
{
	JSONObject obj = new JSONObject();
	
	obj.put("key", Key);
	obj.put("value", Value);
}


// read the key and check for deuplicates

public static void read(String key)
{
	JSONObject obj = new JSONObject();
	
	obj.get("key");
}

//Delete Key-value pair

public static void delete(String Key, JSONObject Value)
{
	JSONObject obj = new JSONObject();
	
	obj.delete("key");
}
		
