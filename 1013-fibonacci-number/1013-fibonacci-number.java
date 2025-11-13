class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            int sum=0;
            int previous=1;
            int secondPrevious=0;
            for(int i=1; i<n;i++){
                sum = previous + secondPrevious;
                int temp= previous;
                secondPrevious= temp;
                previous=sum;
            }
            return sum;
        }
    }
}