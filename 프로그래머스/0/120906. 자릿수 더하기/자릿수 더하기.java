class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            int x = n%10;
            answer+=x;
            n = n/10;
        }
        
        return answer;
    }
}