class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        boolean r0 = true;
                boolean r90 = true;
                boolean r180 = true;
                boolean r270 = true;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j< mat[i].length ; j++){
                r0 = r0 && mat[i][j] == target[i][j];
                r90 &= mat[i][j] == target[j][n - 1 - i];
                r180 &= mat[i][j] == target[n-1-i][n-1-j];
                r270 &= mat[i][j] == target[n-1-j][i];
                  
               }

            }
          return r0 || r90 || r180 || r270;
        }
    }
