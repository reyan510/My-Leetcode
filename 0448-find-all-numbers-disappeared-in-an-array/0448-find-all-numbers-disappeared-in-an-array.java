class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
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
        return list;
    }
}