class Solution {
    public boolean isArmstrong(int n) {
        int totalNum = (int) (Math.log10(n)+1);
        int temp = n;
        int sum = 0;
        while(temp>0){
            int val = temp%10;
            sum += (Math.pow(val%10,totalNum));
            temp = temp/10;
        }
        
        return sum == n;
    }
}