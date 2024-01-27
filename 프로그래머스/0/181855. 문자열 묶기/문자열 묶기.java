import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int count[] = new int[strArr.length];
        HashMap<Integer,Integer> result = new HashMap<>();
        
        for(int i=0;i<count.length;i++){
            count[i] = strArr[i].length();
        }
        
        for(int i=0;i<count.length;i++){
            if(result.get(count[i])==null){
                result.put(count[i],0);
            }
            result.put(count[i],result.get(count[i])+1);
        }
        
        int max = 0;
        for(int i: result.values()){
            max = Math.max(i,max);
        }
        
        answer = max;
        return answer;
    }
}