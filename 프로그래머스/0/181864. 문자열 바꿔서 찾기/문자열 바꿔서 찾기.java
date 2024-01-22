class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char word[] = myString.toCharArray();
        String result = "";
        for(int i=0;i<word.length;i++){
            if(word[i]=='A'){
                result += "B";
            }
            else{
                result += "A";
            }
        }
        
        boolean a = result.contains(pat);
        
        answer = (a==true) ? 1 : 0;
        return answer;
    }
}