class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] array = my_string.toCharArray();
        
        char s = array[num1];
        array[num1] = array[num2];
        array[num2] = s;
        
        String answer = new String(array);
        return answer;
    }
}