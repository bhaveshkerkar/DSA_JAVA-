import java.util.*;

public class ifelse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //user input
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are Eligible for vote");
        }

        if(age > 13 && age < 18){
            System.out.println("You are Teenager");
        }
        else{
            System.out.println("You Can't Vote");
        }
    }
}