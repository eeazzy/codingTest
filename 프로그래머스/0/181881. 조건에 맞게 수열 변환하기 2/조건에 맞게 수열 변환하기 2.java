import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int result[] = new int[arr.length];
        int count = 0;
        while(true){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50&&arr[i]%2==0){
                    result[i]=arr[i]/2;
                }
                else if(arr[i]<50&&arr[i]%2!=0){
                    result[i]=arr[i]*2+1;
                }
                else{
                    result[i]=arr[i];
                }
            }
            count++;
            if(Arrays.equals(result, arr)){
                break;
            }
            else{
                arr = Arrays.copyOf(result,result.length);
            }
        }
        
        answer=count-1;
        return answer;
    }
}