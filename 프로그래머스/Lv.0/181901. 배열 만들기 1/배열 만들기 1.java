import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=1;i<=n;i++){
            if(i%k==0){
                result.add(i);
            }
        }
        
        answer = new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}