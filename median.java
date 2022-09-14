class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]merged = new int[nums1.length+nums2.length];
        merged = merge(nums1, nums2, merged, 0, 0, 0);
        
        if(merged.length % 2 == 0){
            return (merged[(merged.length-1)/2]+merged[((merged.length-1)/2)+1])/2d;
        }else{
            return merged[(merged.length/2)];
        }
    }
    
    public static int[]merge(int[]num1, int[]num2, int[] merged, int i, int j, int k){
        
        if( k >= merged.length){
            return merged;
        }
        else if(j >= num2.length){
            merged[k] = num1[i];
            return merge(num1, num2, merged, i+1, j,k+1);
        }
        else if(i >= num1.length){
            merged[k] = num2[j];
            return merge(num1, num2, merged, i, j+1, k+1);
        }
        
        if(num1[i] < num2[j]){
            merged[k] = num1[i];
            return merge(num1, num2, merged, i+1, j,k+1);
        }
        else if(num2[j] < num1[i]){
            merged[k] = num2[j];
            return merge(num1, num2, merged, i, j+1, k+1);
        }
        else {
            merged[k] = num1[i];
            merged[k+1] = num2[j];
            return merge(num1, num2, merged, i+1, j+1, k+2);
        }
        
    }
}
