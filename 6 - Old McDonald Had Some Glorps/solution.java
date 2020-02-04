//This solution was written by Jake Crampton.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //System.out.println(n);
        double[] x= new double[n];
        double[] y= new double[n];
        for(int i=0;i<n;i++){
            x[i]=scan.nextDouble();
            y[i]=scan.nextDouble();
        }
        boolean bad=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    double dist=Math.pow((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]),0.5);
                    //System.out.println(dist);
                    if(dist<=1.0)
                        bad=true;
                }
            }
        }
        if(bad)
            System.out.println("Unsafe!");
        else
            System.out.println("Safe!");
        
    }
}
