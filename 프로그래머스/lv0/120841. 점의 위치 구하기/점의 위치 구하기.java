class Solution {
    public int solution(int[] dot) {
        boolean x = dot[0] > 0 ? true : false;
        boolean y = dot[1] > 0 ? true : false;
        
        if(x == true  && y == true ) return 1;
   else if(x == false && y == true ) return 2;
   else if(x == false && y == false) return 3;
   else if(x == true  && y == false) return 4;        
        return 0;
    }
}