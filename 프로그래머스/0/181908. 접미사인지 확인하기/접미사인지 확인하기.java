class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String result[] = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            result[i] = my_string.substring(i);
        }
        
        for(int i=0;i<result.length;i++){
            if(result[i].equals(is_suffix)){
                answer = 1;
                break;
            }
           
        }
        
        return answer;
    }
}