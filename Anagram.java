package arraySection;
import java.util.*;

public class Anagram {
//	@SuppressWarnings("unused")
	public void angram(ArrayList<Character> restful,  ArrayList<Character> fluster) {
		int gram1 = 0;
//		int high = restful.size()-1;

		for(int i=restful.size()-1; i>=0; i--) {
			if (restful.contains(fluster.get(i))) {		//FIGGA THIS OUTTTTT
				gram1 ++;
				restful.remove(restful.get(i));
				fluster.remove(fluster.get(i));
			}			
//			else {
////				return false;
//			}
		}
		if (restful.size()==0 && fluster.size() ==0) {
			System.out.println("they are anagrams....");
		} else {
			System.out.println("They are not anagrams");
		}
		for( char g: restful) {
			System.out.println(g);	
		}
		
		System.out.println(gram1);
		
		for( char f: fluster) {
			System.out.println(f);
		}
//		System.out.println(restful.toArray());
//	return true;
	}
//	public void result() {
//		if (angram(restful, fluster)) != false){
//			Sy);
//		}
//	}
}

//List<Character> rest  = new ArrayList<>();
//List<Character> flus = new ArrayList<>();

//my thoughts are to find a way to write a method
//to search through both arraylists to check if all elements are the same
//first thing is to have rest[0] and check the 
//iterate through one of the arraylists and check if the other list
//contains that element. eg. if flus.contains(rest[i]

//Im thinking to use a for loop for this because we need to check the elements to ensure they are the same
//I was gonna use a while loop but thats only good for running  an action until a result is achieved
//An enhanced for loop was also an option but that doesnt allow the comparison of elements 

//we will start from the end because 
//it wil give a better run time 
//than starting from the beginning 
//and shifting everything with every removal

//the latest finding is that you can take out a letter
//and this code so far would work
//or it can have a duplicate

