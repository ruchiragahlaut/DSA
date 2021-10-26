package String;
import java.util.*;
public class checkStringPalli {
    public static void check(String in){
        int l = in.length();
        Boolean flag = false;
        for(int i=0;i<l/2;i++){
            char a = in.charAt(i);
            char b = in.charAt(l-i-1);
            
            if(a == b){
                continue;
            }
            else{
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.print("not pallindrome");
        }
        else{
            System.out.print("pallindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String in = sc.next();
        Boolean flag = false; 
        check(in);
        //System.out.println(flag);
       


    } 
}
