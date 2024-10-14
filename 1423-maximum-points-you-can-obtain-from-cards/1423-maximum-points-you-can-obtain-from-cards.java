class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += cardPoints[i];
        }

        int ans = sum;
        int pre = k-1;
        int j = n-1;
        while(pre >= 0){
            sum = sum - cardPoints[pre];
            sum = sum + cardPoints[j];
            ans = Math.max(ans, sum);
            pre--;
            j--;
        }
        return ans;
    }
}