class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==num&&j==num){
                    answer[num][num] = 1;
                    num++;
                }
                else{
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}