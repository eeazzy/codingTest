import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        ArrayList<Integer> num = new ArrayList<Integer>();
        int square = 1;
        
        for(int i=0;i<arr.length;i++){
            num.add(arr[i]);
        }
        
        while(square<arr.length){
            square*=2;
        }
        
        if(arr.length<square){
            for(int i=0;i<square-arr.length;i++){
                num.add(0);
            }
        }
        
        answer = new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}