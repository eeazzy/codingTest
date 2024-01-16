class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char word [] = myString.toCharArray();
        
        for(int i=0;i<word.length;i++){
            if(Character.isUpperCase(word[i])){
                answer += word[i];
            }
            else{
                answer += Character.toUpperCase(word[i]);
            }
        }
        return answer;
    }
}