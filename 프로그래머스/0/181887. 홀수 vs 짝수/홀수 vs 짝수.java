class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num1=0,num2=0;
        
        for(int i=0;i<num_list.length;i++){
            if(i%2==0){
                num1+=num_list[i];
            }
            else{
                num2+=num_list[i];
            }
        }
        
        answer = (num1>num2) ? num1:num2;
        return answer;
    }
}