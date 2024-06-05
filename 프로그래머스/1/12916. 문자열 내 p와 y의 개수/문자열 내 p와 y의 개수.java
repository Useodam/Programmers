class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cntP = 0;
        int cntY = 0;
        String change = s.toLowerCase();
        char[] arr = change.toCharArray();  
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'p'){
                cntP++;
            } else if(arr[i] == 'y'){
                cntY++;
            }
            
        }
        
        if(cntP == cntY){
            answer = true;
        } else {
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}