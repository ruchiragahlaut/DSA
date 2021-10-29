package Array;
import java.util.*;
public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = n;
        int c = 0;
        int new_k = 0;
        //count the digits
        

        while (num != 0) {
            num /= 10;
            c++;
        }
        k=k%c;
        if (k < 0) {
            k = c + k;
        }

        int power1 = (int) Math.pow(10, (k));
        int power2 = (int) Math.pow(10, (c - k));

        //System.out.print(power1+" "+power2);

        int right = (n / power1);

        int left = (n % power1) * power2;

        System.out.println(left + right);





    }
}
