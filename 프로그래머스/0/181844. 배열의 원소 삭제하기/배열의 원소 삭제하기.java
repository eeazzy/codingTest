import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    arr[i] = 0;
                    break;
                }
            }
        }
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                num.add(arr[i]);
            }
        }
        
        answer = new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}