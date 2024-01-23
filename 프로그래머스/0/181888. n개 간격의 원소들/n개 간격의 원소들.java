import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for(int i=0;i<num_list.length;i++){
            if(i%n==0){
                num.add(num_list[i]);
            }
        }
        
        answer = new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}