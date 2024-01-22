class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
       if(target.length()<=my_string.length()){
            String result[] = new String[my_string.length()-target.length()+1];

            for(int i=0;i<result.length;i++){
                result[i] = my_string.substring(i,i+target.length());
            }

            for(int i=0;i<result.length;i++){
                if(result[i].equals(target)){
                    answer = 1;
                    break;
                }
            }
       }
        else{
            answer =0;
        }
        
        return answer;
    }
}