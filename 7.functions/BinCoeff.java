public class BinCoeff {


    public static int factN(int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int binCoeff(int n, int r){
        int fact_n = factN(n);
        int fact_r = factN(r);
        int fact_nmr = factN(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;    
    }
    public static void main(String args []){
        System.out.println(binCoeff(5, 2));
    }
}
