class Solution {
    public int solution(int[] array) {
        int len = array.length;   //배열의 길이
        int maxCnt = 1;           //최대 등장 수
        int max = array[0];       //최빈값
        boolean isDouble = false; //중복여부 (-1 리턴을 위함.)
        
        for(int j = 0; j < len-1; j++){
            int count = 1;
            for(int i = j+1; i < len; i++){
                //재등장 시, count 증가
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