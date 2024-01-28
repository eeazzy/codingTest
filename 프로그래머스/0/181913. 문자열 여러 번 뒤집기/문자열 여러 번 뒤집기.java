import java.math.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char word[] = my_string.toCharArray();
        char temp;
        for(int i=0;i<queries.length;i++){
            int firstIndex = queries[i][0];
            int lastIndex = queries[i][1];
            for(int j=0;
                j<Math.abs((queries[i][1]-queries[i][0]+1)/2);j++){
                temp = word[firstIndex];
                word[firstIndex] = word[lastIndex];
                word[lastIndex] = temp;
                firstIndex++; lastIndex--;
            }
        }
        
        for(char i:word){
            answer+=i;
        }
        return answer;
    }
}