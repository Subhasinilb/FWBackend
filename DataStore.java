public static void main(String args[])
{
	String Key = new String();
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
					
