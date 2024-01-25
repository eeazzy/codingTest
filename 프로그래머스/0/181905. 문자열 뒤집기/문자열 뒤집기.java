class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char word[] = my_string.toCharArray();
        
        for(int i=0;i<s;i++){
           answer+=word[i];
        }
        for(int i=e;i>=s;i--){
            answer+=word[i];
        }
        for(int i=e+1;i<word.length;i++){
            answer+=word[i];
        }
        return answer;
    }
}