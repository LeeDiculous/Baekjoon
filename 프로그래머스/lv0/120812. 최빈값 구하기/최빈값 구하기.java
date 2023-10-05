class Solution {
    public int solution(int[] array) {
        int len = array.length;
        int[] copyArr = array;
        int maxCnt = 1;
        int max = array[0];
        boolean isDouble = false;
        
        for(int j = 0; j < len-1; j++){
            int count = 1;
            for(int i = j+1; i < len; i++){
                if(array[j] == array[i]) count++;
            }
            if(count > maxCnt){
                max = array[j];
                maxCnt = count;
                isDouble = false;
            } 
            else if(count == maxCnt){
                isDouble = true;
            }
        }
        int answer = isDouble ? -1 : max;
        return answer;
    }    
}