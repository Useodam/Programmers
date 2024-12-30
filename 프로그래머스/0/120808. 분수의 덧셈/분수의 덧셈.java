class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int bunja = (numer1 * denom2) + (denom1 * numer2);
        
        int bunmo = denom1 * denom2;
        
        int a = bunja;
        int b = bunmo;
        
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int common = a;
        
        return new int[]{bunja/common, bunmo/common};
    }
}