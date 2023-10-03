class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        for(String word : strlist){
            answer[i++] = word.length();
        }
        return answer;
    }
}