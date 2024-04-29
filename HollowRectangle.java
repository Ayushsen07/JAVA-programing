import java.util.Scanner;

public class HollowRectangle{
    public static void main(String args[]){
        int totalrow =8;
        int totalcolm = 9;
        for(int i=1;i<=totalrow;i++){
            for(int j=1;j<=totalcolm;j++){
                if(i==1||i==totalrow ||j == 1||j == totalcolm){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
                
            }
            System.out.println();
        }








    }
}
