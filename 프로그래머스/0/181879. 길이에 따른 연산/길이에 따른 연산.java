class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int num = num_list.length;
        if(num>=11){
            for(int i=0;i<num;i++){
                answer += num_list[i];
            }
        }
        else if(num<=10){
             answer =1;
            for(int i=0;i<num;i++){
                answer *= num_list[i];
            }
        }
        return answer;
    }
}