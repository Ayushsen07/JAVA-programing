public class FactorialByFunction{
    public static void fact(int n){
        int facto=1;
        for(int i=1;i<=n;i++){
             facto= facto*i;
            

        }
        System.out.print(facto);
      // return facto;

    }
    public static void main(String args[]) {
        fact(5);
        
    }
}