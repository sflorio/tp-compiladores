package simplelanguage;

import java.util.HashMap;

public class code {
	public static HashMap<String, Object> hm = new HashMap<>();
	
	
	public static void Put(String identifier, Object value) {
		hm.put(identifier, value);
	}
	
	public static void Put(Object identifier, Object value) {
		hm.put((String)identifier, (Integer)value);
	}
			   			   
	public static Object Get(String identifier) {
		return hm.get(identifier);
	}
	
	public static Object Get(Object identifier) {
		return hm.get((String)identifier);
	}

	public static Integer GetIntValue(Object identifier) {
		return (Integer)Get((String)identifier);
	}
   	
	public static String GetBoolString(Object value) {
		return (Boolean)value ? "True" :"False";
	}
   
	public static void Show(Object value) {	
		System.out.println("Resultado: " +  (String)value);
	}
	
	public static void PrintLn(String value) {	
		System.out.println(value);
	}
}
