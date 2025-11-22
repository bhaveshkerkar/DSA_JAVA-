import java.util.*;

public class dowhile{
    public static void main(String args[]){
        // int counter = 1;
        // do{
        //     System.out.println("Hello World");
        //     counter ++;
        // }while( counter <= 10);

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n){
            System.out.println(counter);
            counter ++;
        }
    }
}