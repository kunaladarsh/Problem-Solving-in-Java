import java.util.Scanner;
class printN_number{

    static int numberPrintNto1(int n){
    if(n==1){
        return (1);
    }
    System.out.println(n);
     return numberPrintNto1(n-1);
     
    }

    static void numberPrint1toN(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
     numberPrint1toN(n-1);
     System.out.println(n);
     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Input: ");
            int n = sc.nextInt();
            numberPrint1toN(n);
            System.out.println(numberPrintNto1(n));
        }
    }

