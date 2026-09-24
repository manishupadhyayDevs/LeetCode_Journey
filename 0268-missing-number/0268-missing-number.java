class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length; // number of array
        int sum=n;
       // int sumArray=0;
    
       for(int i=0;i<n ;i++){
        sum = sum^i^nums[i];
       }
       return sum;
    }
}