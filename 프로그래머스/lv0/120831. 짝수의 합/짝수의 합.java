class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2 == 1) n -= 1; //홀수인 경우, 짝수로 변환
        while(n > 0){
            answer += n;
            n = n-2;
        }
        return answer;
    }
}