class Solution {
    public boolean isValidSudoku(char[][] board) {
        
/*
NOTES:
This solution is O(N) yet it is a bit inefficient
I do 3 runs through the array. Horizontally, Vertically, then
by group (3x3). During each run I am checking to see none of the members match each
other using a temp array.
However, I realize now that the 3x3 groups are simply a function 
of the X and Y positions int group = x/3 + (y/3 * 3)
So you could simply initialize 3 2-dimensional arrays
and do 1 run instead of 3 because I can now check
SIMULTANEOUSLY

 */
    for (int i = 0; i < 9;i++)
    {
        int[] temp = new int[9];
        for (int z = 0; z < 9; z++)
        {
            int val = Character.getNumericValue(board[i][z]);
            if (val < 0) continue;
            //System.out.println(val);
            if (temp[val-1]>0) return false;
            temp[val-1]++;
        }
    }
    for (int i = 0; i < 9;i++)
    {
        int[] temp = new int[9];
        for (int z = 0; z < 9; z++)
        {
            int val = Character.getNumericValue(board[z][i]);
            if (val < 0) continue;
            if (temp[val-1]>0) return false;
            temp[val-1]++;
        }

    }
    //System.out.println("hi there");
    // add 3x3 subbox check

    for (int i = 0; i < 9; i++)
    {
   
    if (i%3!=0) continue;
    int level = 0;
    while (level < 3)
    {
    int[] temp = new int[9];
    int offset = level * 3;
    for (int j = 0; j < 9; j++)
    {

        int x = j - 3 * (j /3) + offset;
        int y = i + (j/3);
        int val = Character.getNumericValue(board[y][x]);
        //System.out.println(val);
        if (val < 0) continue;
        if (temp[val-1] > 0) return false;
        temp[val-1]++; 
    }
    level++;

    }
    
    }


    return true;
    }
}
//validSudoku medium O(N)
