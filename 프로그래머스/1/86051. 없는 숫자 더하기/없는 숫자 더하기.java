class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int allSum = 45;
        
        for(int i : numbers){
            answer += i;
        }
        
        return allSum - answer;
    }
}