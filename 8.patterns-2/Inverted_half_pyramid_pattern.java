public class Inverted_half_pyramid_pattern {
    public static void Inverted_half_pyramid_pattern(int n){
        // outer loop
        for( int i=1; i <= n; i ++){
            // inner Loop
            for (int j = 1; j <= n - i ; j ++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
        public static void main(String[] args) {
            Inverted_half_pyramid_pattern(4);
    }
}
