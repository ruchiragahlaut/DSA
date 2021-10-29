package String;
import java.util.*;
public class printAllSubsequence {
    public static ArrayList<String> call(String str){
        if(str.length()==0){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }
        char c = str.charAt(0);
        String rem = str.substring(1);

        ArrayList<String> h = call(rem);
        ArrayList<String> hh = new ArrayList<>();

        for(String a : h){
            hh.add(""+a);
        }
        for(String a: h){
            hh.add(c+a);
        }
        return hh;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        ArrayList<String> re = call(str);
        System.out.println(re);

    }
}
