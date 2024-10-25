class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int m = matrix.length;        // Number of rows
        int n = matrix[0].length;     // Number of columns
        int i = 0, j = 0;             // Starting indices
        int totalElements = m * n;    // Total number of elements to traverse
        int count = 0;                // Track the number of elements added to result

        while (m > 0 && n > 0) {
            // Traverse from left to right
            for (int k = 0; k < n && count < totalElements; k++) {
                result.add(matrix[i][j]);
                count++;
                j++;
            }
            i++;
            j--;
            m--;

            // Traverse from top to bottom
            for (int k = 0; k < m && count < totalElements; k++) {
                result.add(matrix[i][j]);
                count++;
                i++;
            }
            i--;
            j--;
            n--;

            // Traverse from right to left
            for (int k = 0; k < n && count < totalElements; k++) {
                result.add(matrix[i][j]);
                count++;
                j--;
            }
            i--;
            j++;
            m--;

            // Traverse from bottom to top
            for (int k = 0; k < m && count < totalElements; k++) {
                result.add(matrix[i][j]);
                count++;
                i--;
            }
            i++;
            j++;
            n--;
        }

        return result;
        
    }
}