import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer;
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for(int i=0;i<flag.length;i++){
            if(flag[i]==true){
                for(int j=0;j<arr[i]*2;j++){
                    num.add(arr[i]);                    
                }
            }
            else{
                for(int j=0;j<arr[i];j++){
                    num.remove(num.size()-1);
                }
            }
        }
        
        answer = new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=num.get(i);
        }
        return answer;
    }
}