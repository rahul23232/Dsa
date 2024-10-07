class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int ans =0;
        int prefix = 0;
        for(int i=0; i<n; i++){
            prefix += nums[i] == 1 ? 1 : -1;

            if(map.containsKey(prefix)){
                ans = Math.max(ans, i - map.get(prefix));
            }else{
                map.put(prefix, i);
            }                
        }

        return ans;

        
    }
}