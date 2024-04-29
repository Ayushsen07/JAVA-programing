public class binaryTodec{
    public static void bintodec(int bin){
        
        int pow = 0; 
        int decnum = 0;
        while(bin>0){
            int lastdigit= bin % 10;
             
            decnum = decnum + (lastdigit *(int)Math.pow(2,pow));
            pow++;
            bin= bin/10;
        }
       System.out.print("decimel of"  +bin+ " ="+ decnum);
        }
        public static void main(String args[]){
            bintodec(1011);
        }
        
    }
