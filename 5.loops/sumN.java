import java.util.*;

public class sumN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <=a){
            sum = sum+i;
            i++;
        }
        System.out.print("The sum is:" + sum);
    }
}