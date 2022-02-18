package arraySection;

public class reverseArrayAnswer {
	
	public int[] solve(int[] nums) {	//this "solve" method will return an array and will take in the array we wish to reverse
		
		int lownum = 0;		//we gotta have a reference to a first item of the array
		int highnum = nums.length-1;	//we gotta have a reference to the last number in the array
		
		while (lownum < highnum) {
			swap(nums, lownum, highnum);	//this is the swap method, takes an array and two integers
			lownum++;
			highnum--; 
		}
		
		return nums; 
	}

	private void swap(int[] nums, int lownumber, int highnumber) {
		int temp = lownumber;
		lownumber = highnumber;
		highnumber = temp;
		
		
	}

}
