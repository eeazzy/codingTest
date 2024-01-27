import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        if(n==1){
            for(int i=0;i<=slicer[1];i++){
                num.add(num_list[i]);
            }
        }
        else if(n==2){
            for(int i=slicer[0];i<num_list.length;i++){
                num.add(num_list[i]);
            }
        }
        else if(n==3){
            for(int i=slicer[0];i<=slicer[1];i++){
                num.add(num_list[i]);
            }
        }
        else{
            for(int i=slicer[0];i<=slicer[1];i+=slicer[2]){
                num.add(num_list[i]);
            }
        }
        
        answer = new int[num.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}