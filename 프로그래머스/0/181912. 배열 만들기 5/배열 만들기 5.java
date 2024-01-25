import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        String result[] = new String[intStrs.length];
        ArrayList <Integer> num = new ArrayList<Integer>();
        
        for(int i=0;i<intStrs.length;i++){
            result[i] = intStrs[i].substring(s,s+l);
        }
        
        for(int i=0;i<result.length;i++){
            if(Integer.parseInt(result[i])>k){
                num.add(Integer.parseInt(result[i]));
            }
        }
        
        answer = new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}