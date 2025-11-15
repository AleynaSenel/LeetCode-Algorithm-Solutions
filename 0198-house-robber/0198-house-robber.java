class Solution {
    public int rob(int[] nums) {
    if(nums.length==0) return 0;
     int[] kayit= new int[nums.length+1];
     kayit[0]= 0;
     kayit[1]=nums[0];

     for(int i=1; i<nums.length; i++){
        int val = nums[i];
        kayit[i+1] = Math.max(kayit[i-1] + val, kayit[i]);

     }

     return kayit[nums.length];


        
        
    }
}