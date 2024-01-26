import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer;
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for(int i=0;i<intervals.length;i++){
            int index = intervals[i][0];
            for(int j=intervals[i][0];j<=intervals[i][1];j++){
                num.add(arr[index]);
                index ++;
            }
        }
        
        answer = new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}