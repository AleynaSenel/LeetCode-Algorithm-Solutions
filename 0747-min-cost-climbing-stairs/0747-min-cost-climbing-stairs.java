class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for( int i=2; i<cost.length;i++){
           
           cost[i]= cost[i] + Math.min(cost[i-1],cost[i-2]);

           
        }
        int son= cost.length -1;
        return Math.min(cost[son], cost[son-1]);
    }
}