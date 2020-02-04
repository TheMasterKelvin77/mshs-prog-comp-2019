//This solution was written by Noah Zemlin.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        boolean[][] posis = new boolean[5][5];
        
        Scanner scn = new Scanner(System.in);
        
        for (int y = 0; y < 5; y++) {
            String word = scn.next();
            for (int x = 0; x < 5; x++) {
                if (word.charAt(x) == 'k' && posis[x][y] == true) {
                    System.out.println("invalid");
                    return;
                }
                if (word.charAt(x) == 'k') {
                    try{
                        posis[x-2][y+1] = true;
                    }catch(Exception e) {
                        //dont care lol
                    }
                    try{
                        posis[x-1][y+2] = true;
                    }catch(Exception e) {
                        //dont care lol
                    }
                    try{
                        posis[x+1][y+2] = true;
                    }catch(Exception e) {
                        //dont care lol
                    }
                    try{
                        posis[x+2][y+1] = true;
                    }catch(Exception e) {
                        //dont care lol
                    }
                }
            }
        }
        System.out.println("valid");
    }
}
