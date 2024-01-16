class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char word[] =my_string.toCharArray();
        char ALP[] =alp.toCharArray();

        for(int i=0;i<word.length;i++){
            if(word[i]==ALP[0]){
                answer += Character.toUpperCase(word[i]);
            }
            else{
                answer += word[i];
            }
        }
        return answer;
    }
}