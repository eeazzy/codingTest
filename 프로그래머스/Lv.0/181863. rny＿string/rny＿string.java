class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        char word [] = rny_string.toCharArray();
        
        for(int i=0; i<word.length;i++){
            if(word[i]=='m'){
                answer += "rn";
            }
            else{
                answer += word[i];
            }
        }
        return answer;
    }
}