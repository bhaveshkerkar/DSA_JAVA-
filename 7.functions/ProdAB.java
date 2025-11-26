public class ProdAB {
    public static int prodAB(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int prod = prodAB(a, b);
        System.out.println("a * b = " + prod);
    }
    
}
