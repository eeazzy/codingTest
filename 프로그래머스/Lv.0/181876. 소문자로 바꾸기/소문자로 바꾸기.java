class Solution {
    public String solution(String myString) {
        String answer = "";
        char word[] = myString.toCharArray();
        
        for(int i=0;i<word.length;i++){
            if(Character.isLowerCase(word[i])){
                answer += word[i];
            }
            else{
                answer += Character.toLowerCase(word[i]);
            }
        }
        return answer;
    }
}