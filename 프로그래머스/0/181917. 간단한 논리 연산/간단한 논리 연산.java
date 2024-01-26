class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        boolean x12 = (x1 == false && x2 == false) ? false : true; 
        boolean x34 = (x3 == false && x4 == false) ? false : true;
        
        answer = (x12 == true && x34 == true) ? true : false;
        
        return answer;
    }
}