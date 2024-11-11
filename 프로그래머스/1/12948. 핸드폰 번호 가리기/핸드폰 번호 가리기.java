class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int a = phone_number.length();
        
        answer = phone_number.replaceAll(".(?=.{4})", "*");
        
        return answer;
    }
}