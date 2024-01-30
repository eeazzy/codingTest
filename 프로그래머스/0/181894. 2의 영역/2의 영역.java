import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i:arr){
            num.add(i);
        }
        
        int firstIndex = num.indexOf(2);
        int lastIndex = num.lastIndexOf(2);
        
        if(firstIndex == -1){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[lastIndex-firstIndex+1];
            int index = 0;
            for(int i=firstIndex;i<=lastIndex;i++){
                answer[index] = num.get(i);
                index++;
            }
        }
        return answer;
    }
}