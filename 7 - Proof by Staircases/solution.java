import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] F=new int[n+1];
        if(n==0)
            System.out.println("1");
        else if(n==1)
            System.out.println("1");
        else{
            F[0]=1;
            F[1]=1;
            for(int i=2;i<=n;i++){
                F[i]=F[i-1]+F[i-2];
            }
            System.out.println(F[n]);
        }
    }
}
