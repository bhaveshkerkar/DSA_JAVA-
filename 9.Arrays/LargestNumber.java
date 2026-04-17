import java.util.*;

public class LargestNumber {

    public static int largestNumber(int numbers[] ){
            int largest = Integer.MIN_VALUE;

            for( int i = 0; i<numbers.length; i++){
                if( largest < numbers[i]){
                  largest = numbers[i];
            }
        }

        return largest;

    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 3 ,1};
        System.out.println("The Largest number is " + largestNumber(numbers));
    }
}
