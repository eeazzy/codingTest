class Solution {
    public int solution(String number) {
        int answer = 0;
        char num[] = number.toCharArray();
        int result = 0;
        for(int i=0;i<num.length;i++){
            result += Character.getNumericValue(num[i]);
        }
        
        answer = result % 9;
        return answer;
    }
}