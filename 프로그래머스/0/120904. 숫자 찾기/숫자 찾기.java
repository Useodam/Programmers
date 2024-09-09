import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        ArrayList<Integer> length = new ArrayList<>();
        
        while(num>0){
            length.add(0, num % 10);
            num = num/10;
        }
        
        for(int i=0; i<length.size(); i++){
            if(length.get(i)==k){
                return i+1;
            } 
        }
        
        return answer;
    }
}