package String;
import java.util.*;
public class reverseTheString {
    public static void reverse(String[] value){
        int l = value.length;
        for(int i=0;i<l/2;i++){
            String s = value[i];
            value[i] = value[l-i-1];
            value[l-i-1] = s;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value [] = sc.next().split(",");
        reverse(value);
        for(int i=0;i<value.length;i++){
            System.out.print(value[i]+",");
        }

    }
}
