import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        ArrayList<String> name = new ArrayList<String>();
        
        for(int i=0;i<names.length;i++){
            if(i%5==0){
                name.add(names[i]);
            }
        }
        
        answer = new String[name.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=name.get(i);
        }
        return answer;
    }
}