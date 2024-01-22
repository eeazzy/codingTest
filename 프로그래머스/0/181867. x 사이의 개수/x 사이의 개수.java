import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer;
        String word[] = myString.split("x");
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for(int i=0;i<word.length;i++){
            num.add(word[i].length());
        }
        
        if(myString.charAt(myString.length()-1)=='x'){
            num.add(0);
        }
        
        answer = new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = num.get(i);
        }
        
        return answer;
    }
}