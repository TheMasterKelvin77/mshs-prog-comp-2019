//This solution was written by Jake Crampton.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char[][] board=new char[5][5];
        for(int i=0;i<5;i++){
            String line=scan.next();
            for(int j=0;j<5;j++){
                board[i][j]=line.charAt(j);
            }
        }
        boolean bad=false;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(board[i][j]=='k'){
                    try{
                        if(board[i+1][j+2]=='k')
                            bad=true;
                    }catch(Exception e){}
                    try{
                        if(board[i-1][j+2]=='k')
                            bad=true;
                    }catch(Exception e){}
                    try{
                        if(board[i+1][j-2]=='k')
                            bad=true;
                    }catch(Exception e){}
                    try{
                        if(board[i-1][j-2]=='k')
                            bad=true;
                    }catch(Exception e){}
                    try{
                        if(board[i+2][j+1]=='k')
                            bad=true;
                    }catch(Exception e){}
                    try{
                        if(board[i-2][j+1]=='k')
                            bad=true;
                    }catch(Exception e){}
                    try{
                        if(board[i+2][j-1]=='k')
                            bad=true;
                    }catch(Exception e){}
                    try{
                        if(board[i-2][j-1]=='k')
                            bad=true;
                    }catch(Exception e){}
                }
            }
        }
        if(bad)
            System.out.println("invalid");
        else System.out.println("valid");
    }
}
