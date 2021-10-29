package String;

import java.util.*;
public class socondMostRepeated {
    public static String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> hp = new HashMap<>();
        
        for(String a : arr){
            if(hp.containsKey(a)){
                int val = hp.get(a);
                val = val+1;
                hp.put(a,val);
            }
            else{
                hp.put(a,1);
            }
        }
        int lar =0;
        int slar=0;
        String re1 ="";
        String re2 ="";
        //System.out.println(hp);
        
        for(String k : hp.keySet()){
            int a  = hp.get(k);
            if(a>lar && a>slar){
                int temp = lar;
                lar = a;
                slar = temp;
                
                String tem = re1;
                re1 = k;
                re2 = tem;
                
            }
            else if(a<lar && a>slar){
                slar = a;
                re2 = k;
            }
        }
        return re2;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        String re = secFrequent(arr, arr.length);
        System.out.println(re);

    }   
}
