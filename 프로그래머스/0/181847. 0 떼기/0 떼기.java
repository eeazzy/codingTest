class Solution {
    public String solution(String n_str) {
        String answer = "";
        char word[] = n_str.toCharArray();
        int num=0;
        
        for(int i=0;i<word.length;i++){
           if(word[i]!='0'){
               num = i;
               break;
           }
        }
        
        for(int i=num;i<word.length;i++){
            answer+=word[i];
        }
        return answer;
    }
}