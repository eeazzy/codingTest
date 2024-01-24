class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char word[] = my_string.toCharArray();

        for(int i=0;i<word.length;i++){
            if(i%m==0){
                answer += word[i+c-1];
            }
        }
        return answer;
    }
}