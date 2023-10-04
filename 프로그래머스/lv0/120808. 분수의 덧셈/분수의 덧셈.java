class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int sumNumer = (numer1 * denom2) + (numer2 * denom1);
        int sumDenom = denom1 * denom2;
        int grtComDiv = 1;
        int count = 1;
        
        while(count <= sumNumer && count <= sumDenom){
            if(sumNumer%count == 0 && sumDenom%count == 0) grtComDiv = count;
            count++;
        }
        
        int[] answer = {sumNumer/grtComDiv, sumDenom/grtComDiv};
        return answer;
    }
}