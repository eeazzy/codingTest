class Solution {
    public String solution(String myString) {
        String answer = "";
        char word[] = myString.toCharArray();
        
        for(int i=0;i<word.length;i++){
            if(word[i] == 'a' ||
              word[i] == 'b' ||
              word[i] == 'c' ||
              word[i] == 'd' ||
              word[i] == 'e' ||
              word[i] == 'f' ||
              word[i] == 'g' ||
              word[i] == 'h' ||
              word[i] == 'i' ||
              word[i] == 'j' ||
              word[i] == 'k'){
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