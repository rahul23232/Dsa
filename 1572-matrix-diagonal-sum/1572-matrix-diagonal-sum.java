class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        int i=0;
        int j= 0;
        while(i<n && j<n){
            sum += mat[i][j];
            i++;
            j++;
        }

        i=0;
        j= n-1;
        while(i<n && j>=0){
            sum += mat[i][j];
            i++;
            j--;
        }
        if(n%2 != 0){
            int val = n/2;
            sum = sum - mat[val][val];
        }
        return sum;
        
        
    }
}