package Arrays;

public class Left_Rotation {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int d = 4;
		
		for(int i = 1; i <= d; i++) {
		reverse(a);
		}
		
		//test
        for(int i = 0; i< a.length; i++) {
			System.out.print(a[i]);	
		}
		
	}
	
	public static void reverse(int[] nums) {

	        int first = nums[0];
	        
	        for(int i = 0; i < nums.length-1; i++) {
	        	nums[i] = nums[i+1];
	        }
	        nums[nums.length-1] = first;
	}
	
}
