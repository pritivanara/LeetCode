class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        
        for(int row = 0; row < mat.length; row++){
                //primary diagonal
                sum += mat[row][row];
            for(int col = 0; col < mat[row].length ; col++){
                // Secondary diagonal
                if(row + col == mat.length - 1 && row != col){
                    sum += mat[row][col];
                }
            }
        }
         return sum;
    }
}