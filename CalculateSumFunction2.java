import java.util.Scanner;

public class CalculateSumFunction2 {
    public static void Calculatesum(int a,int b){   //parameter or formal parameter
       // Scanner sc = new Scanner(System.in);
       
        int sum= a+b;

       System.out.println("sum is "+ sum); 
    }




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
    Calculatesum(a,b);    //argument or actual parameter
    }
}