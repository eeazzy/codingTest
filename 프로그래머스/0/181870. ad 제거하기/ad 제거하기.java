import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        boolean index[] = new boolean[strArr.length];
        ArrayList<String> result = new ArrayList<String>();
        
        for(int i=0;i<index.length;i++){
            index[i] = strArr[i].contains("ad");
        }
        
        for(int i=0;i<index.length;i++){
            if(index[i]==false){
                result.add(strArr[i]);
            }
        }
        
        answer = new String[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}