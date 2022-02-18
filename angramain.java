package arraySection;

import java.util.ArrayList;
import java.util.List;

public class angramain {

	public static void main(String[] args) {

		ArrayList<Character> restful = new ArrayList<>();
		restful.add('r');
		restful.add('e');
		restful.add('s');
		restful.add('t');
		restful.add('f');
		restful.add('u');
		restful.add('l');
		
		ArrayList<Character> fluster = new ArrayList<>();
		fluster.add('f');
		fluster.add('l');
		fluster.add('u');
		fluster.add('s');
		fluster.add('t');
		fluster.add('e');
		fluster.add('r');
		
		Anagram gram = new Anagram();
		
		gram.angram(fluster, restful);

	}

}
