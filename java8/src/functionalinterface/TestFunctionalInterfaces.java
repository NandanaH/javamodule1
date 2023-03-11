package functionalinterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		
		
		List<String> strings = 
				Arrays.asList("Andhra Pradesh", "Tamil Nadu","Telangana","Kerala");
		Function<String,Integer> fu = (str)->{
			
			return str.length();
			
		};
		for(String str : strings)
		{
			System.out.println(fu.apply(str));
		}
		
		Function<String,Integer> f = (str)->{
			                                   return str.length();
		                                    };
		System.out.println(f.apply("Buneos dias"));
		
		Function<Integer,Integer> f2 = (n)->{
			 return n*n;
		};
		System.out.println(f2.apply(25));
		
		Function<String,String> f3 = (str)->{
			
			       return str.toUpperCase();
		};
	    System.out.println(f3.apply("kulathoor ust "));
	}

}
