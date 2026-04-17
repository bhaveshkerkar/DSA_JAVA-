import java.util.*;

public class ArrayCC {
        // int marks[] = new int[100];
        // System.out.println("Lenght of an Array: " + marks.length);
        // Scanner sc = new Scanner(System.in);
        //  marks[0] = sc.nextInt();
        //  marks[1] = sc.nextInt();
        //  marks[2] = sc.nextInt();

        //  System.out.println("phy:" + marks[0]);
        //  System.out.println("Chem:" + marks[1]);
        //  System.out.println("Math:" + marks[2]);


        //  int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        //  System.out.println("Percentage: " + percentage + "%");
        

            public static void Update(int marks[]) {
                for (int i = 0; i < marks.length; i++){
                    marks[i] = marks[i] + 1;

                }
            }
    public static void main(String[] args) {

        int marks[]  = { 98 , 99 ,97};
        Update(marks);

        //printing the updated marks
        for(int i = 0; i < marks.length; i++){
            System.out.println("Updated Marks : " + marks[i]);
        }
    }
}
