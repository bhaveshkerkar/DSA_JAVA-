import java.util.*;

public class elseif{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible for vote");
        }
        else if(age >=13 && age <=17){
            System.out.println("Tennager");
        }
        else{
            System.out.println("Not aligible for vote");
        }
    }
}