class Solution {
    public String solution(String myString) {
        String answer = "";
        char word[] = myString.toCharArray();
        
        for(int i=0;i<word.length;i++){
            if(word[i]<'l'){
                answer += "l";
            }
            else{
                answer += word[i];
            }
        }
        //abcdefghijk
        return answer;
    }
}