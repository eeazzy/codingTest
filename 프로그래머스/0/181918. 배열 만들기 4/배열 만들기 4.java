import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk;
        ArrayList<Integer> result = new ArrayList<>();
        int i=0;
        
        while(i<arr.length){
            if(result.isEmpty()){
                result.add(arr[i]);
                i++;
            }
            else if(!result.isEmpty() && 
                    result.get(result.size()-1)<arr[i]){
                result.add(arr[i]);
                i++;
            }
            else if(!result.isEmpty() &&
                    result.get(result.size()-1)>=arr[i]){
                result.remove(result.size()-1);
            }
        }
        
        stk = new int[result.size()];
        for(int j=0;j<stk.length;j++){
            stk[j] = result.get(j);
        }
        return stk;
    }
}