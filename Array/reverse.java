package Array;

import java.util.*;

public class reverse {

    public static void main(String[] args) {
        // write your code here  
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int n = num;
        
        while(n!=0){
            int r = n%10;
            System.out.println(r);
            n/=10;
        }
    }
}