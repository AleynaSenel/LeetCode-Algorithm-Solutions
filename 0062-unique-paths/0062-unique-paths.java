class Solution {
    public int uniquePaths(int m, int n) {
         int[][] dizi=new int[m][n];
       for(int a=0; a<m;a++){
        dizi[a][0]=1;
       }
       for(int b=0; b<n;b++){
        dizi[0][b]=1;
       }
      
       
        for(int i=1; i<m ; i++){ 
            for(int k=1; k<n; k++){  
              dizi[i][k]=dizi[i-1][k] + dizi[i][k-1];
            }
        }
        return dizi[m-1][n-1];
       
        
    }
}