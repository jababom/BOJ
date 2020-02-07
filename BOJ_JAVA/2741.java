import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int T;
        String t=br.readLine();
        T=Integer.parseInt(t);
        for(int i=1;i<=T;i++){

            String result=String.valueOf(i);
            bw.write(result+'\n');

        }
        bw.flush();
        bw.close();
    }
}
