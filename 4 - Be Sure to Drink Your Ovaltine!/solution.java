import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        String ans="";
        for(int i=0;i<n;i++){
            switch(scan.nextInt()){
                case 1:
                    ans=ans+"q";
                    break;
                case 2:
                    ans=ans+"m";
                    break;
                case 3:
                    ans=ans+"l";
                    break;
                case 4:
                    ans=ans+"j";
                    break;
                case 5:
                    ans=ans+"v";
                    break;
                case 6:
                    ans=ans+"t";
                    break;
                case 7:
                    ans=ans+"r";
                    break;
                case 8:
                    ans=ans+"g";
                    break;
                case 9:
                    ans=ans+"p";
                    break;
                case 10:
                    ans=ans+"u";
                    break;
                case 11:
                    ans=ans+"o";
                    break;
                case 12:
                    ans=ans+"f";
                    break;
                case 13:
                    ans=ans+"b";
                    break;
                case 14:
                    ans=ans+"z";
                    break;
                case 15:
                    ans=ans+"a";
                    break;
                case 16:
                    ans=ans+"i";
                    break;
                case 17:
                    ans=ans+"n";
                    break;
                case 18:
                    ans=ans+"w";
                    break;
                case 19:
                    ans=ans+"h";
                    break;
                case 20:
                    ans=ans+"x";
                    break;
                case 21:
                    ans=ans+"k";
                    break;
                case 22:
                    ans=ans+"s";
                    break;
                case 23:
                    ans=ans+"y";
                    break;
                case 24:
                    ans=ans+"e";
                    break;
                case 25:
                    ans=ans+"d";
                    break;
                case 26:
                    ans=ans+"c";
                    break;
            }
        }
        System.out.println(ans);
    }
}
