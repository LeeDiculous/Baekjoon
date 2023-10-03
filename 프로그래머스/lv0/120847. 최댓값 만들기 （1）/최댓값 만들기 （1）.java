class Solution {
    public int solution(int[] numbers) {
        int max    = 0;
        int notMax = 0;
        
        for(int i = 0; i < numbers.length; i++){
            if(max <= numbers[i]){
                notMax = max;  
                max = numbers[i]; 
            }
            else if(max > numbers[i] && notMax < numbers[i]){
                notMax = numbers[i];
            }
        }
        
        return max*notMax;
    }
}