import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int T;
        String t=br.readLine();
        T=Integer.parseInt(t);
        for(int i=1;i<=T;i++){

            String s=br.readLine();
            StringTokenizer st=new StringTokenizer(s);
            String[] val=s.split(" ");
            int A=Integer.parseInt(val[0]);
            int B=Integer.parseInt(val[1]);
            int sum=A+B;
            String result=String.valueOf(sum);

            bw.write("Case #"+i+": "+A+" + "+B+" = "+result+'\n');

        }
        bw.flush();
        bw.close();
    }
}
