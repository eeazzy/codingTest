import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        ArrayList <Integer> num = new ArrayList<>();
        
        for(int i=0;i<queries.length;i++){
            num.clear();
            for(int j=queries[i][0];j<=queries[i][1];j++){
                if(arr[j]>queries[i][2]){
                    num.add(arr[j]);
                }
            }
            if(num.isEmpty()){
                answer[i] = -1;
            }
            else{
                answer[i] = Collections.min(num);
            }
            
        }
        return answer;
    }
}