public class QueSumOfDigits {

public  static int sumOfDigits(int n) {
    int sum = 0;

    while(n > 0) {
        int lastDigit = n % 10;   // get last digit
        sum = sum + lastDigit;    // add to sum
        n = n / 10;               // remove last digit
    }

    System.out.println("Sum of digits: " + sum);
    return sum;
} 

public static void main(String[] args) {
    sumOfDigits(123);
    
}
}