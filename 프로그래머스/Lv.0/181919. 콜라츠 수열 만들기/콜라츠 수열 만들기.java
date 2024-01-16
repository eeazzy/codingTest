import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while(n!=1){
            if(n%2==0){ // 짝수
                result.add(n);
                n/=2; 
            }
            else if(n%2!=0){ // 홀수
                result.add(n);
                n=(3*n+1);
            }
        }
        result.add(1);
        
        answer=new int[result.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }

        
        return answer;
    }
}