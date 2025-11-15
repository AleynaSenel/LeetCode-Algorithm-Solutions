class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==0) return 0;
        int[] test= new int[10001];
       test[0]=0;
      
                                        //amaç yanyana olmayan evleri seçmek
        for(int sayi: nums){
            test[sayi] += sayi; 
        }
        int take=0;
        int skip=0;
       for(int i=0; i<test.length;i++){
         
         int takei = skip + test[i];  //bir öncekinin en buyugu + şuanın degeri
         int skipi = Math.max(skip,take);  //bir öncekinin en buyugu
         take = takei;
         skip = skipi;
       
       }
       return Math.max(take,skip);
    }
}