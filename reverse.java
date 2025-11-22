import java.util.*;

public class reverse{
    public static void main(String args[]){
        // int a = 12345;
        // int rev = 0;
        
        // while(a > 0){
        //     int n = a % 10;
        //     rev = (rev * 10) + n;
        //     System.out.print(n);
        //     a = a/10;
        // }
        // System.out.println();

    //     int n = 45678;
    //     int rev = 0;

    //     while( n> 0){
    //         int lastDigit = n % 10;
    //         rev = (rev * 10)  + lastDigit;
    //         n = n/10;
    //     }
    //     System.out.println(rev);
    // }

    int rev = 0;

    Scanner sc = new Scanner(System.in);
    
        for (int n = sc.nextInt(); n > 0; n = n / 10) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
        }
        System.out.println(rev);
    }
}
