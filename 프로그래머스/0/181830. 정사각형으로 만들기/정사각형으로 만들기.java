import java.math.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int colum = arr[0].length;
        int[][] answer = new int[Math.max(row,colum)][Math.max(row,colum)];
        
        for(int i=0;i<row;i++) {
            for (int j=0;j<colum;j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        if(row < colum){
            for(int i=row;i<colum;i++){
                for(int j=0;j<colum;j++){
                    answer[i][j] = 0;
                }
            }
        }
        else if(row > colum){
            for(int i=0;i<row;i++){
                for(int j=colum;j<row;j++){
                    answer[i][j] = 0;
                }
            }
        }
        
        return answer;
    }
}