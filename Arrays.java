package arraySection;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = new int [10];
		
		for(int i=0; i<nums.length; ++i) {
			nums[i] = i;
		}
		
		for(int i=0; i<nums.length; i++ ) {
//			System.out.println(Arrays.toString(nums));
			System.out.println(nums[i]);
		}
		
//		LINEAR SEARCH => O(N)
//		eg. if we wanna search element at 8
		for (int i=0;i<nums.length;i++) {
			if (i==8)
				System.out.println(nums[8]);
			
		}

	}

	
}
