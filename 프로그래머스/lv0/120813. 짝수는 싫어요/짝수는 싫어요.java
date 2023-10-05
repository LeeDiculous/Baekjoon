class Solution {
    public int[] solution(int n) {
        int num = (n%2 == 0) ? n-1 : n;
        int cnt = 1;
        int[] answer = new int[num/2+1];
        
        for(int i = 0; i < num/2+1; i++){
            answer[i] = cnt;
            cnt += 2;
        }
        
        return answer;
    }
}