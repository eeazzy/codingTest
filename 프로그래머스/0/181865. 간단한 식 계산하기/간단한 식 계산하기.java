class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String num[];
        
        if(binomial.contains("+")){
            num = binomial.split("\\+");
            answer = Integer.parseInt(num[0].trim())+Integer.parseInt(num[1].trim());

        }
        else if(binomial.contains("-")){
            num = binomial.split("-");
            answer = Integer.parseInt(num[0].trim())-Integer.parseInt(num[1].trim());
        }
        else{
            num = binomial.split("\\*");
            answer = Integer.parseInt(num[0].trim())*Integer.parseInt(num[1].trim());
        }
        return answer;
    }
}