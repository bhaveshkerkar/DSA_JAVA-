// import java.util.*;

// public class LargestNumber {

//     public static int largestNumber(int numbers[] ){
//             int largest = Integer.MIN_VALUE;
//             int smallest = Integer.MAX_VALUE;

//             for( int i = 0; i<numbers.length; i++){
//                 if( largest < numbers[i]){
//                   largest = numbers[i];
//             }
//             if (smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest Value is : " + smallest );
//         return largest;

//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 3 ,1};
//         System.out.println("The Largest number is : " + largestNumber(numbers));
//     }
// }

// largest number

// class solution {
//     public int largestNumber(int nums[]){
//         int largest = nums[0];
//         // int arr[] = {4, 2, 9, 1, 7};

//         for( int i = 1; i < nums.length; i++ ){
//             if( nums[i] > largest){
//                 largest = nums[i];

//             }
            
//         }
//         return largest;
//     }
        
// }

//smallest number

    class solution {
        public int findSmallestNum(int nums[]){

            int smallest = nums[0];

            for(int i = 1; i < nums.length; i++){
                if( nums[i] < smallest ){
                    smallest = nums[i];
                }
            }
            return smallest;
        }
    }