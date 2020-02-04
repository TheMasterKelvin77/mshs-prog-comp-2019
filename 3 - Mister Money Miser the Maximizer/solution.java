import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int high= -2147483648;
        for(int i=0;i<5;i++){
            int n=scan.nextInt();
            if(n>high)high=n;
        }
        System.out.println(high);
    }
}
