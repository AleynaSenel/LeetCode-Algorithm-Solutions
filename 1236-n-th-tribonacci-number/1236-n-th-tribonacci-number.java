class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else if(n==3){
            return 2;
        }else{
            int sum=4;
            int previous=2;
            int secondPrevious=1;
            int thirdPrevious=1;

            for(int i=0;i<(n-3);i++){
                sum = previous + secondPrevious + thirdPrevious;
                int temp=secondPrevious;
                secondPrevious= previous;
                previous=sum;
                thirdPrevious=temp;

                

            }
            return sum;
        }
    }
}