class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sArr1=0, sArr2=0;
        
        if(arr1.length>arr2.length){
            answer = 1;
        }
        else if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                sArr1+=arr1[i];
            }
            for(int i=0;i<arr2.length;i++){
                sArr2+=arr2[i];
            }
            
            if(sArr1>sArr2){
                answer = 1;
            }
            else if(sArr1==sArr2){
                answer = 0;
            }
            else{
                answer = -1;
            }
        }
        else{
            answer = -1;
        }
        
        return answer;
    }
}