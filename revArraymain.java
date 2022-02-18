package arraySection;
import java.util.Arrays;

public class revArraymain {
	
	public static void main(String[] args) {
		
		int[] numbs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		reverseArray reverse = new reverseArray();
		
//		System.out.println(Arrays.toString(T));
		
		System.out.println(Arrays.toString(reverse.solve(numbs)));
		
	}

}
