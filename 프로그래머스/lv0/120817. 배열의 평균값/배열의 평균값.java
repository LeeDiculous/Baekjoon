import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).sum()/(double)numbers.length;
        return answer;
    }
}