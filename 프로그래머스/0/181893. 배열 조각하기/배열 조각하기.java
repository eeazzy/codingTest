import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                while (true) {
                    int idx = query[i] + 1;
                    if (idx >= list.size()) {
                        break;
                    }
                    list.remove(idx);
                }
            } else {
                int idx = 0;
                while (true) {
                    if (idx == query[i]) {
                        break;
                    }
                    list.remove(0);
                    idx++;
                }
            }

        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}