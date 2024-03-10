class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    /*
     The 2D matrix is sorted by column and row. The last element of column i is less
     than the first element of i + 1. We can find the row in log (rows) time. Then we
     just have to find the column, which we can find in log (columns) time. 
     */
    int m = matrix.length -1; int n = matrix[0].length -1;
    //first find the correct row
    int start = 0; int end = m;
    int row = -1;
    
    while (start <= end)
    {
    int mid = (start + end ) /2;
    if (matrix[mid][n] < target) start = mid + 1;
    else if (matrix[mid][0] > target) end = mid - 1;
    else 
     {
    row = mid;
    break;
    }
    }


    if (row == -1) return false;
    
    //then find target and return;
    start = 0; end = n;
    while (start <= end)
    {        
    int mid = (start + end )/2;
    if (matrix[row][mid] < target ) start = mid + 1;
    else if (matrix[row][mid] > target ) end = mid -1;
    else 
    return true;

    }

    return false;
    }
}
//search_a_2D_matrix medium O(logN*M)
