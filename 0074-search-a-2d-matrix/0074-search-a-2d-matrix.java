class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int lo = 0, hi = rows*cols - 1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int midrow = mid/cols, midcol= mid%cols;
            if(matrix[midrow][midcol] == target) return true;
            else if(matrix[midrow][midcol]> target) hi = mid -1;
            else lo = mid +1;
        }
        return false;
    }
}