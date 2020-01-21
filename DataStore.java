import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public static void main(String args[])
{
	String Key = new String();
	
	System.out.print("\n1.Create Key-Value Data Store\n2.Read from Data Store \n3.Delete Key-Value pair \n4.Exit\nEnter your option:");
}


// create a data store with key and value

public static void create(String Key, JSONObject Value)
{
	JSONObject obj = new JSONObject();
	
	obj.put("key", Key);
	obj.put("value", Value);
}


// read the key and check for deuplicates

public static void read(String key)
					
