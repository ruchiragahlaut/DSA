package String;
import java.util.*;

public class printAllduplicates {

    static int len = 256;

    public static void countt(String s, int c[]){
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
        }
    }

    public static void printchars(String ss){
        int count [] = new int[len];
        countt(ss,count);

        for(int i=0;i<256;i++){
            if(count[i]>1){
                System.out.println((char)(i)+" --> "+count[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printchars(str);

    }
}
