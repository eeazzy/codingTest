class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        char preWord[] = is_prefix.toCharArray();
        char word[] = my_string.toCharArray();
        
        if(preWord.length<word.length){
            for(int i=0;i<preWord.length;i++){
                if(word[i]!=preWord[i]){
                    answer = 0;
                }
            }
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}