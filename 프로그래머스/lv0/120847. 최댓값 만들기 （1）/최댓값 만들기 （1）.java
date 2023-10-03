
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
//     public int solution(int[] numbers) {
//         int max    = 0;
//         int notMax = 0;
        
//         for(int i = 0; i < numbers.length; i++){
//             if(max <= numbers[i]){
//                 notMax = max;  
//                 max = numbers[i]; 
//             }
//             else if(max > numbers[i] && notMax < numbers[i]){
//                 notMax = numbers[i];
//             }
//         }
        
//         return max*notMax;
//     }
