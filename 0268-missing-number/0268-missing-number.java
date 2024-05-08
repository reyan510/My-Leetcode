class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int tSum = (n*(n+1))/2;
        int actSum = Arrays.stream(nums).sum();
        return tSum - actSum;
        
        
        
        
        /*int n = nums.length;
        int ans = 0;
        
        for(int i = 1; i<=n; i++){
            ans = ans^i;
        }
        
        for(int i = 0; i<n; i++){
            ans = ans^nums[i];
        }
        
        return ans;*/
    }
}