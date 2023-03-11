package strings;

public class Testtrings {

	public static void main(String[] args) {
		
		byte bytes[] = {65,66,67,68,69};
		
		String str= new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str="Welcome to UST Global";
		
		bytes = str.getBytes();
		for(byte b:  bytes) {
			System.out.println(b);
		}
		
		char chars[] = {'U','S','T',' ','G'};
		
		str = new String(chars);
		System.out.println(str);
		
		str.getChars(0,chars.length-1,chars,0);
		for (char c:chars)
			System.out.println(c);

	
	String string = new String("She sell sea shells in  sea shore");
	String s = string;
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i) == 's' || s.charAt(i) == 'S')
		{
			count++;
		}
	}
	System.out.println("Number of S in the string"+count);
	String words[] = string.split(" ");
	System.out.println(words.length);
	
	for(String word: words) {
		System.out.println(word);
	}
	string = new String("Cartoon");
	System.out.println(string.startsWith("Car"));
	System.out.println(string.endsWith("toon"));
	
	int apos = string.indexOf('a');
	int tpos = string.indexOf('t');
	
	String string2 = string.substring(apos,tpos);
	System.out.println(string);
	       string2 = string.substring(tpos);
	       System.out.println(string);
	       
	string = new String("madamdam");
	
	//int mpos = -1;
	int dpos = string.indexOf('d', -1);
	System.out.println(dpos);
	string2 = string.substring(dpos, string.length());
	System.out.println(string2);
	
	String str1 = new String("welcome");
	String str2 = new String("WELCOME");
	//String str2 = new String("WELCOME");
	//String str2 = new String("welcome");
	
	
	boolean result = str1.equals(str2);
	//boolean result = str1.equalsIgnoreCase(str2);
	System.out.println(result);
	
	//int val = str1.compareTo(str2);
	int val = str2.compareTo(str1);
	System.out.println(val);
	
	string = "Diehard";
	System.out.println(string.toLowerCase());
	System.out.println(string);
	System.err.println(string.toUpperCase());
	System.out.println(string);
	
	//"16-11-477/6/A/3 Hyderabad 500036"
	string = "16-11-477/6/A/3 Hyderabad 500036";
	int a=0,b=0,c=0;
	for (int i=0;i<=string.length();i++) {
		
		char ch = string.charAt(i);
		if(Character.isDigit(ch))
		{
			a++;
			
		}
		else if(Character.isLetter(ch))
		{
			b++;
		}
		else
		{
			c++;
		}
	}
	
	
}
	
	
	
	
	
	
	
	}

	
	



