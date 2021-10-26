package Array;


import java.util.*;

public class gcd {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int x1=n1;
        int x2=n2;
        
        //find gcd
        
        while(x2%x1!=0){
            int r = x2%x1;
            x2=x1;
            x1=r;
        }
        int gcd = x1;
        System.out.println(gcd);
        
        int lcm = n1*n2/gcd;
        System.out.println(lcm);
        
        

       
    }
}