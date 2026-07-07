class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //flip
        for(int row = 0 ; row < image.length; row++){
            int s = 0;
            int e = image[row].length - 1;
            while( e > s){
                int temp = image[row][s];
                image[row][s] = image[row][e];
                image[row][e] = temp;
                s++;
                e--;
            }
            for(int i = 0; i < image[row].length ; i++){
                if(image[row][i] == 0){
                        image[row][i] = 1;
                }
                else{
                    image[row][i] = 0;
                }
            }
        }
        return image;
    }
}