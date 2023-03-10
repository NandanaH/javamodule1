package listdemo;


import java.util.Collection;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;
public class TestTreeMap {
	
	public static void main(String[] args) {
		
		
		TreeMap<String,String> countryCurr = new TreeMap<>();
		
		countryCurr.put("India","Rupee");
		countryCurr.put("USA","Dollar");
		countryCurr.put("UK","Pound");
		
		
		System.out.println(countryCurr);
	
		System.out.println(countryCurr.get("India"));
		
		countryCurr.put("India","Rupe");
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Dollar"));
		//HashMap has 3 views
				//1. key view
				
				Set<String> keys = countryCurr.keySet();
				for(String key : keys) {
					System.out.println(key);
				}
				
				//2. values view
				
				Collection<String> values = countryCurr.values();
				for(String value: values) {
					
					System.out.println(value);
				}
				
				//3. key-values together - EntrySet
				
				Set<Entry<String,String>> entries = countryCurr.entrySet();
				for(Entry<String,String> entry: entries) {
					
					System.out.println(entry);
				}		
			}

		

		
		
	}


