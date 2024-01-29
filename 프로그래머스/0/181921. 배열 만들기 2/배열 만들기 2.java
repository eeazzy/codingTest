import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> num = new ArrayList<>();
        String equals="";
        for(int i=l;i<=r;i++){
            String number = Integer.toString(i);
            for(int j=0;j<number.length();j++){
                if(number.charAt(j)=='5'||
                   number.charAt(j)=='0'){
                   equals += number.charAt(j);
                }
            }
            if(equals.equals(number)){
                num.add(Integer.parseInt(number));
            }
            equals = "";
        }
        
        if(num.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[num.size()];
            int index = 0;
            for(int i:num){
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}