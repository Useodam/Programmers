class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String hol = "";
        String zzak = "";
        
        for(int i: num_list){
            if(i%2 != 0){
                hol += i;
            } else {
                zzak += i;
            }
        }
        
        int holNum = Integer.parseInt(hol);
        int zzakNum = Integer.parseInt(zzak);
        
        answer = holNum+zzakNum;
        
        
        return answer;
    }
}