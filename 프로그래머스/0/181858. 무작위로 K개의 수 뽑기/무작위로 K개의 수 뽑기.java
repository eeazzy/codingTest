import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer;
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i:arr){
            if(!num.contains(i)){
                num.add(i);
            }
        }
        
        if(num.size()<k){
            while(num.size()<k){
                num.add(-1);
            }
        }
        else if(num.size()>k){
            while(num.size()>k){
                num.remove(num.size()-1);
            }
        }
        
        answer = new int[num.size()];
        int index = 0;
        for(int i:num){
            answer[index] = i;
            index++;
        }
        return answer;
    }
}