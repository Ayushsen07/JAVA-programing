import java.util.Scanner;

public class TaxCalculate{
    public static void main(String args[]){
        Scanner sc = new  Scanner (System.in);
        int inc = sc.nextInt();
        int tax;
        if(inc<500000){
            tax = 0;
        }
        else if (inc>500000 && inc<1000000){
            tax = (int) (inc* 0.2);
        }
        else {
            tax =(int)(inc * 0.5);
        }
        System.out.println("your tax is" + tax );


    }
}