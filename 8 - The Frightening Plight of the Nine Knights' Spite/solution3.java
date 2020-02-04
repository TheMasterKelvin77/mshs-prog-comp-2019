import java.io.*;
import java.util.*;

public class Solution {

    public static char[][] placements = new char[5][5];
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean valid = true;
        
        //input
        for(int i = 0; i < 5; i++){
            String input = scan.next();
            for(int j = 0; j < 5; j++){
                placements[i][j] = input.charAt(j);
            } 
        }
        
        //algorithm
        for(int i = 0; i < 5; i++){
            //Each point on each row
            for(int j = 0; j < 5; j++){
                if(testKnight(i, j)){
                    if(testNeighbors(i, j)){
                        valid = false;
                        break;
                    }
                    
                }
            }
        }
        
        //output
        if (valid) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        
        
    }
    
    public static boolean testNeighbors (int x, int y){
        if(pointInBounds(x - 1, x - 2) && testKnight(x - 1, x - 2)){
            return true;
        }
        else if(pointInBounds(x - 1, y + 2) && testKnight(x - 1, y + 2)){
            return true;
        }
        else if(pointInBounds(x + 1, y - 2) && testKnight(x + 1, y - 2)){
            return true;
        }
        else if(pointInBounds(x + 1, y + 2) && testKnight(x + 1, y + 2)){
            return true;
        }
        else if(pointInBounds(x - 2, y - 1) && testKnight(x - 2, y - 1)){
            return true;
        }
        else if(pointInBounds(x + 2, y - 1) && testKnight(x + 2, y - 1)){
            return true;
        }
        else if(pointInBounds(x - 2, y + 1) && testKnight(x - 2, y + 1)){
            return true;
        }
        else if(pointInBounds(x + 2, y + 1) && testKnight(x + 2, y + 1)){
            return true;
        }
        else{
            //No knights in range
            return false;
        }
    }
    
    //Test is point in array
    public static boolean pointInBounds(int x, int y){
        return !(x<0 || x>4 || y<0 || y>4);
    }
    
    //Test if knight
    public static boolean testKnight(int x, int y){
        //if(pointInBounds(x, y)){
            return placements[x][y] == 'k';
        //}
        //else{
        //    return false;
        //}
    }
}
