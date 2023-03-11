package userdefinedobjects;

import java.util.HashMap;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		String str = "I had had had a little lamp";
		String words[] = str.split(" ");
		System.out.println(words);
		System.out.println(words.length);
		
		HashMap<String,Integer> freq = new HashMap<>();
		for (String c : words)
		{
			Integer y = freq.get(c);
			
			if(y == null)
			{
				freq.put(c, 1);
			}
			else
			{
				freq.put(c, y+1);
			}
		}
		System.out.println(freq);
		
		
		int i = 12321;
		String str3 = i+"";
		StringBuilder sb = new StringBuilder(str3);
		StringBuilder rev = sb.reverse();
		boolean result = str3.equals(sb.toString());
		System.out.println(result);
		
	}

}
