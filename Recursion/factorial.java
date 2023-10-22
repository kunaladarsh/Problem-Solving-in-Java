import java.util.Scanner;

public class factorial {
    static int factorialprint(int n){
       if(n==1){
        return n;

       }
    return n * factorialprint(n-1);
    }
    
public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Input: ");
   int n = sc.nextInt();
   System.out.println(factorialprint(n));
}
}