class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        boolean index[] = new boolean[str_list.length];
        
        for(int i=0;i<index.length;i++){
            index[i] = str_list[i].contains(ex);
        }
        
        for(int i=0;i<index.length;i++){
            if(index[i]==false){
                answer+=str_list[i];
            }
        }
        return answer;
    }
}