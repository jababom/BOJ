import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int M=sc.nextInt();

        if(M<45)
            H-=1;
        if(H<0)
            H=23;
        M=(M+15)%60;

        System.out.print(H+" "+M);
    }
}
