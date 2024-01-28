import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        ArrayList <Integer> num = new ArrayList<>();
        int i=0;
        
        while(i<arr.length){
            if(num.isEmpty()){
                num.add(arr[i]);
                i++;
            }
            else if(!num.isEmpty() &&
                    num.get(num.size()-1)==arr[i]){
                num.remove(num.size()-1);
                i++;
            }
            else if(!num.isEmpty() &&
                    num.get(num.size()-1)!=arr[i]){
                num.add(arr[i]);
                i++;
            }
        }
        
        if(num.isEmpty()){
            num.add(-1);
        }
        answer = new int[num.size()];
        int index = 0;
        for(int j:num){
            answer[index] = j;
            index++;
        }
        
        return answer;
    }
}