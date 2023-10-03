class Solution {
    public int solution(int n, int k) {
        int dish  = 12000;
        int drink =  2000;
        int sum   = dish*n;
        
        if(n/10 >= 1){
            k -= n/10;
        }
        sum += drink*k;
        return sum;
    }
}