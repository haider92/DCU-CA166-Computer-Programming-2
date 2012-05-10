class Part4 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,13,6,7,8,9};
		boolean status=false;
		int counter=0;
		while(!status && counter<nums.length) {
			if(nums[counter]%13==0) {
				System.out.println(nums[counter]);
				status=true;
			} 
			counter++;
		} if(!status) System.out.println("No Such Number");
	}
}