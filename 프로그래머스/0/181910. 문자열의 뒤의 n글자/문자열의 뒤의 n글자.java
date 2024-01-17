class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String result = "";
        
        char word[] = my_string.toCharArray();
        for(int i=word.length-1;i>=word.length-n;i--){
            result += word[i];
        }
        
       char word2[] = result.toCharArray();
        for(int i=word2.length-1;i>=0;i--){
            answer += word2[i];
        }
        
        
        return answer;
    }
}