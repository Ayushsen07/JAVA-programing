import java.util.Scanner;

public class CalculateSumFunction {
    public static void Calculatesum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum= a+b;

       System.out.println("sum is "+ sum); 
    }




    public static void main(String args[]){
    Calculatesum();
    }
}