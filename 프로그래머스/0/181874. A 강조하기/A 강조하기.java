class Solution {
    public String solution(String myString) {
        String answer = "";
        char word[] = myString.toCharArray();
        
        for(int i=0;i<word.length;i++){
            if(word[i]=='a' || word[i]=='A'){
                answer+='A';
            }
            else{
                answer+=Character.toLowerCase(word[i]);
            }
        }
        
        return answer;
    }
}