package String;
import java.util.*;
public class stringRotation {
    public static boolean areRotate(String str1, String str2){
       
        return (str1.length()==str2.length()) && ((str1 + str1).indexOf(str2) != -1);

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(areRotate(str1,str2)){
            System.out.println("yes strings are rotations of each other");
        }
        else{
            System.out.println("No");
        }
    }
}
