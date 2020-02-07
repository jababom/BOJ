import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        int X;
        String t=br.readLine();
        StringTokenizer st = new StringTokenizer(t);
        N=Integer.parseInt(st.nextToken());
        X=Integer.parseInt(st.nextToken());
        int[] val = new int[N];
        String arr=br.readLine();
        StringTokenizer st2 = new StringTokenizer(arr);
        for(int i=0;i<N;i++){

            val[i]=Integer.parseInt(st2.nextToken());
            if(val[i]<X)
                bw.write(val[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}
