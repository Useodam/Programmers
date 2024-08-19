class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char arr [] = my_string.toCharArray();
        
        for(int i=0; i < arr.length; i++){
            for(int y=1; y<=n; y++){
                answer += arr[i];     
            }
        }
        
        return answer;
    }
}