class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String i: order){
            if(i.contains("americano")||i.equals("anything")){
                answer += 4500;
            }
            else if(i.contains("cafelatte")){
                answer += 5000;
            }
        }
        return answer;
    }
}