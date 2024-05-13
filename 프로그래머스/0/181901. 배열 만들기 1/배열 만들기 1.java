class Solution {
    public int[] solution(int n, int k) {
        int a = n/k;
        int[] answer = new int[a];
        
        for(int i=0; i<answer.length; i++){
            int sum = k * (i+1);
            answer[i] = sum;
        }
        
        return answer;
    }
}