import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] answer;
        ArrayList<String> result = new ArrayList<String>();
        String word="";
        
        char a[] = my_string.toCharArray();
        
        for(int i=0;i<a.length;i++){
            if(a[i]==' '){
                result.add(word);
                word = "";
            }
            else{
                word += a[i];
            }
        }
        result.add(word);
        
        answer = new String[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}