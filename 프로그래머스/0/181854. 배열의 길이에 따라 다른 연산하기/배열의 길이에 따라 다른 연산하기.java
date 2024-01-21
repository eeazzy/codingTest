class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        int num = arr.length;
        
        if(num%2!=0){
            for(int i=0;i<num;i+=2){
                arr[i]+=n;
            }
        }else{
            for(int i=1;i<num;i+=2){
                arr[i]+=n;
            }
            
        }
        
        answer = arr;
        return answer;
    }
}