import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        HashMap<String,Integer> count = new HashMap<>();
        char alp;
        for(int i=0;i<52;i++){
            if(i<26){
                alp = (char)('A'+i);
                count.put(String.valueOf(alp),0);
            }
            else{
                alp = (char)('a'+i-26);
                count.put(String.valueOf(alp),0);
            }
        }
        
        for(int i=0;i<my_string.length();i++){
            String key = String.valueOf(my_string.charAt(i));
            if(count.containsKey(key)){
                count.put(key,count.get(key)+1);
            }
        }
        
        for(int i=0;i<answer.length;i++){
            if(i<26){
                alp = (char)('A'+i);
                answer[i] = count.get(String.valueOf(alp));
            }
            else{
                alp = (char)('a'+i-26);
                answer[i] = count.get(String.valueOf(alp));
            }
        }
        
        return answer;
    }
}