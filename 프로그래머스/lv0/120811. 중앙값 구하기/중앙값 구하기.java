class Solution {
    public int solution(int[] array) {
        int len = array.length;
        int min = 0;
        
        //길이가 1인 배열은 첫 인덱스 리턴
        if(len == 1) return array[0];
        
        for(int i = 0; i < len/2+1; i++){
            min = array[i];
            for(int j = i; j < len; j++){
                if(array[j] < min){
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }    
        }
        return min;
    }
}

// 1 2 3 4 5
// 

