import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer;
        ArrayList<String> result = new ArrayList<String>();
        
        StringTokenizer st = new StringTokenizer(myString,"x");
        int count = st.countTokens();
        for(int i=0;i<count;i++){
            String token = st.nextToken();
            if(!token.equals("")){
                result.add(token);
            }
        }
        Collections.sort(result);
        
        answer = new String[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}