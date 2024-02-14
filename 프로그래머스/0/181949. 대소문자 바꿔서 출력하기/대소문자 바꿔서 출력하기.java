import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i=0; i<a.length(); i++){
            char ex = a.charAt(i);
            if(Character.isUpperCase(ex)){
                result += Character.toLowerCase(ex);
            } else {
                result += Character.toUpperCase(ex);
            }
        }
        System.out.println(result);
        
    }
}