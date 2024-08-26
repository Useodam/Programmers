class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        char[] array = my_string.toCharArray();
        
        for(int i=0; i<array.length; i++){
            if(Character.isUpperCase(array[i])){
                answer.append(Character.toLowerCase(array[i]));
            } else {
                answer.append(Character.toUpperCase(array[i]));
            }
        }
        
        
        return answer.toString();
    }
}