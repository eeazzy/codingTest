import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        int j = len-1;
        String[] answer = new String[len];
        
        for(int i=0;i<len;i++){
            answer[i] = my_string.substring(j,len);
            j--;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}