class Solution {
    public int climbStairs(int n) {
        int sum=0;
        int previous=1;
        int secondPrevious=0;
        
        if(n==1){
            return 1;
        }else if(n==2){
          return  2;
        }else{

       for(int i=1;i<=n;i++){
        sum=previous+secondPrevious;
        secondPrevious=previous;
        previous=sum;
        
       }
       return sum;
        }
    }
}