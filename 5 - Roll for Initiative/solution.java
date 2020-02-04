//This solution was written by Jake Crampton.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double sum=0;
        while(scan.hasNext())
            sum+=((double)scan.nextInt())/2+0.5;
        System.out.printf("%.3f\n",sum/n);
    }
}
