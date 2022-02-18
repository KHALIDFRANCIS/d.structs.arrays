package arraySection;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

public class arrayList {
	
	public static void main(String[] args ) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Kevin");
		names.add("Bob");
		names.add("Cory");
		names.add("Smith");
		
//		manipulating the last element has a better runtime O(1) 
//		than manipulating the first element O(N)
		
	for(String pie : names)		//this is saying for every pie in the ArrayList "names"
		System.out.println(pie);	//print it out
		
		
		
	}

}
