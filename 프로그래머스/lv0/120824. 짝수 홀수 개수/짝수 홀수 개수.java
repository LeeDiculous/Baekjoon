class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd  = 0;
        int[] answer = {1,2};
        
        for(int num : num_list){
            int eval = num % 2 == 0 ? even++ : odd++;
        }
        
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}