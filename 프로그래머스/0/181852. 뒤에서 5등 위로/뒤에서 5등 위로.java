class Solution {
	
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        
        int sort [] = bubble(num_list,num_list.length);
        
        for(int i=5;i<sort.length;i++){
            answer[i-5] = sort[i];
        }
        
        return answer;
    }
    
    public int[] bubble(int list[], int n){
        int temp = 0;
        
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(list[j]>list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        
        return list;
    }
}