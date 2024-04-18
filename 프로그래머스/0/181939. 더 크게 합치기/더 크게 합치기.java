class Solution {
    public int solution(int a, int b) {
        int answer = 0;
       
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        String ab = strA + strB;
        String ba = strB + strA;
        
        if(ab.compareTo(ba) > 0){
            
            return answer = Integer.parseInt(ab);
            
        } else {
            return answer = Integer.parseInt(ba);
        }
    }
}
