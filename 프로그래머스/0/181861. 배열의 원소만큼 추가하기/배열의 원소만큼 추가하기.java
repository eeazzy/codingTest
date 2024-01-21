import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int answer[];
        ArrayList<Integer> result =  new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                result.add(arr[i]);
            }
        }
        
        answer = new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}