import java.util.*;
import java.lang.Math;
import java.math.BigDecimal;

public class sample {
    static void add(int num, int num2) {
        String str1 = String.valueOf(num);
        String str2 = String.valueOf(num2);
        int len_str1 = str1.length();
        int len_str2 = str2.length();
        for(int i = 0; i < len_str1; i++) {
            System.out.println();
        }
    }
        
    static void decimal(int num) {
        BigDecimal bd = new BigDecimal(Math.PI);
        BigDecimal bd1 = bd.setScale(num, BigDecimal.ROUND_DOWN);
        System.out.println(bd1);
    }    

    static void InputCook(int num) {
        int[] ary = new int[num];
        for(int i = 0; i < num; i++) {
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        //decimal(num);
    }
}