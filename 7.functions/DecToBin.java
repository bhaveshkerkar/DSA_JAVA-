public class DecToBin {
    public static void DecToBin(int Decimal){
    int myNum = Decimal;
    int pow = 0;
    int binNum = 0;

    while (Decimal > 0) {
        int rem = Decimal % 2 ;
        binNum = binNum + (rem * (int)Math.pow(10,pow));

        pow ++;
        Decimal = Decimal/2;
    }

    System.out.println("decimal of " +myNum+ " is = " + binNum );
}
    
    public static void main(String[] args) {
     DecToBin(25);
        
    }
}

