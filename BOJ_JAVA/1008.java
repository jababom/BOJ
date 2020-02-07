import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        BigDecimal a=new BigDecimal(A);
        BigDecimal b=new BigDecimal(B);
        if(A<=0 || B<=0 || A>9 || B>9)
            return;

        System.out.print(a.divide(b,32, RoundingMode.HALF_EVEN));

    }
}
