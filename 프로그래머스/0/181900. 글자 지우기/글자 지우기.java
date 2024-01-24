import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        char word[] = my_string.toCharArray();
        int index = 0;
        
        for(int i=0;i<word.length;i++){
            if(i==indices[index]){
                if(index<indices.length-1){
                    index++;
                }
            }
            else{
                answer += word[i];
            }
        }
        return answer;
    }
}