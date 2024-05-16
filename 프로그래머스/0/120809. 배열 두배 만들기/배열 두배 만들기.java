class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        for(int i=0; i<numbers.length; i++){
            int sum = numbers[i] * 2;
            answer[i] = sum;
        }
        
        return answer;
    }
}