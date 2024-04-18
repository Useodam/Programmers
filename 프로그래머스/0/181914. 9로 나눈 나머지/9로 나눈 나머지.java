class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i=0; i<number.length(); i++){
            int sum = Integer.parseInt(String.valueOf(number.charAt(i)));
            answer += sum;
        }
        answer %= 9;
        return answer;
    }
}