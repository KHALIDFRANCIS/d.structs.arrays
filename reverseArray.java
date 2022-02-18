package arraySection;
import java.util.Arrays;

public class reverseArray {
	
	public int[] solve (int[] numbs) {
		
		int low = 0;
		int high = numbs.length-1;
		
		while (low < high) {
			swap(numbs, low, high);
			low++;
			high--;
		}
		return numbs;
	}

	private void swap(int[] numbs, int lownum, int highnum) {
		int temp = numbs[lownum];
		numbs[lownum] = numbs[highnum];
		numbs[highnum] = temp;
		
	}

//	public static void main(String[] args) {
//		
//		int[] T = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		System.out.println(Arrays. toString(T));
//
//		int sub = 0;
//	
//		for (int i=0; i<T.length/2; i++) {
//			sub = T[i];
//			T[i] = T[(T.length-1)-i];
////			T[T.length-1-i] = T[i];
//			T[(T.length-1)-i] = sub;
//		}
//		System.out.println(Arrays.toString(T));
//		
//	}

}
