class Solution {
    public int[] twoSum(int[] nums, int target) {
        
		//New Array that holds the sorted positions of each value.
        int[] temp = new int[nums.length];
		
		//for finding the values
        int a[] = new int[2];
		//for finding the indicies of each value
        int b[] = new int[2];
        
		//filling the temp array with the values of nums
        for(int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }
        
		//sorting the temp array that holds the values of nums
        Arrays.sort(temp);
        
		//pointer 1
        int j = nums.length-1;
		
		//pointer 2
        int i = 0;
        
		// if the max pointer plus the min pointer is greater than the target then the max pointer decrements 
		// if the max pointer plus the min pointer is less than the target then the min pointer increments
		//once min and max equal both values are assigned the a[] array.
        while(i<j){
            if(temp[j]+temp[i] > target){
                j--;
            }
            else if(temp[j]+temp[i] < target){
                i++;
            }
            else if(temp[j]+temp[i] == target){
                a[0] = temp[i];
                a[1] = temp[j];
                break;
            }
        }
        
		//the a[] array holds the values of the two sums so once found it will assign the index of the two values referencing 
		//the positions of each value of the original array.
        for(int l = 0; l < nums.length; l++){
            if(nums[l]==a[0] && b[0]==0){
                b[0] = l;
            }
            else if(nums[l]==a[1]&& b[1]==0){
                b[1] = l;
            }
        }
        
        return b;
    }

}
