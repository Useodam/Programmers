class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        
        for(int x=0; x<str1.length(); x++){
            answer = answer+str1.charAt(x) + str2.charAt(x);
        }
         
        
        return answer;
    }
}