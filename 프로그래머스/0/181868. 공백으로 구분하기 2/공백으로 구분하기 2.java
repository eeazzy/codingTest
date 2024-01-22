import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer;
        StringTokenizer st = new StringTokenizer(my_string);
        int num = st.countTokens();
        answer = new String[num];
        for(int i=0;i<num;i++){
            answer[i] = st.nextToken();
        }
        return answer;
    }
}