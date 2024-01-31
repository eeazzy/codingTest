import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer;
        String word[] = myStr.split("[abc]");
        ArrayList<String> result = new ArrayList<>();
        
        if(word.length == 0){
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        else{
            for(String i:word){
                if(!i.equals("")){
                    result.add(i);
                }
            }
            answer = new String[result.size()];
            int index = 0;
            for(String i :result){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}