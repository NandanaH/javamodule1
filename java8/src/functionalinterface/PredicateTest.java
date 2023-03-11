package functionalinterface;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;


public class PredicateTest {

	public static void main(String[] args) {
		
		
		List<String> strings = 
				Arrays.asList("Andhra Pradesh",
						"Tamil Nadu",
						"Telangana",
						"Kerala");
		Predicate<String> p = (String str) ->{
			  return str.length()>10;
		};
		System.out.println(p.test("Hola!"));
		for(String str: strings)
	    System.out.println(p.test(str));
		desiredLength(strings,p);
	}
	public static void desiredLength(List<String> strings, Predicate<String> p) {
		for(String str: strings)
		    System.out.println(p.test(str));

		
	}
		}


