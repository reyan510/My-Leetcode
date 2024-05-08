class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]<0)
                continue;
            nums[idx] *= -1;
        }
        
        for(int i=0; i<n; i++){
            if(nums[i]>0)
                result.add(i+1);
        }
        
        return result;
        
        
        
        /*HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        
        for(int num: nums){
            map.put(num,1);
        }
        
        for(int i=1; i<=n; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;*/
    }
}