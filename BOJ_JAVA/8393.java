import java.util.*;
import java.lang.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int sum=0;
        for(int i=1;i<=T;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
