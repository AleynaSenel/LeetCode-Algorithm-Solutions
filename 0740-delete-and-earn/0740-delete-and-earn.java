class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==0) return 0;
        int[] test= new int[10001];
       test[0]=0;
      
                                        //amaç yanyana olmayan evleri seçmek
        for(int sayi: nums){
            test[sayi] += sayi; 
        }
        int almak=0;
        int atlamak=0;
       for(int i=0; i<test.length;i++){
         
         int almaki = atlamak + test[i];  //bir öncekinin en buyugu + şuanın degeri
         int atlamaki = Math.max(atlamak,almak);  //bir öncekinin en buyugu
         almak = almaki;
         atlamak = atlamaki;
       
       }
       return Math.max(almak,atlamak);
    }
}