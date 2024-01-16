class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int plusNum = a-b;
        
        if(a%2!=0 && b%2!=0){
            answer = (a*a)+(b*b);
        }
        else if(a%2!=0 || b%2!=0){
            answer = 2*(a+b);
        }
        else{
            if(plusNum<=0){
                plusNum*=-1;
                answer = plusNum;
            }
            else{
                answer = plusNum;
            }
        }
        return answer;
    }
}