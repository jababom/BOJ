import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C;
        int result=A*B;
        for(int i=0;i<3;i++){
            C=B%10;
            B=B/10;
            System.out.println(A*C);
        }
        System.out.println(result);

    }
}
