class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for(int i=0; i<nums.length; i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        return gcd(max, min);
        
    }

    public int gcd(int a, int b){
            while(a>0 && b>0){
                if(a>b)
                    a = a%b;
                else
                    b = b%a;
            }
            if(a == 0)
                return b;
            else
                return a;
        }
}