import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer;
        ArrayList<String> result = new ArrayList<String>();
        
        for(int i=0;i<finished.length;i++){
            if(finished[i]==false){
                result.add(todo_list[i]);
            }
        }
        
        answer = new String[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}