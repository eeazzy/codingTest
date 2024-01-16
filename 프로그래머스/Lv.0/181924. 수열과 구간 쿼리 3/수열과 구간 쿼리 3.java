class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] number = new int[queries.length*2];
        int firstNum, secNum;
        
        for(int i=0;i<queries.length;i++){
            number[i*2] = queries[i][0];
            number[i*2+1] = queries[i][1];
        }
        
        for(int i=0;i<queries.length;i++){
            firstNum = arr[number[i*2]];
            secNum = arr[number[i*2+1]];
            arr[number[i*2]] = secNum;
            arr[number[i*2+1]] = firstNum;
        }
        
        answer = arr;
        return answer;
    }
}