import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;;
public class Missing_Number{
    //input
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in = System.in;

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0)
                    return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do
                c = readByte();
            while (c <= ' ');
            if (c == '-') {
                sign = -1;
                c = readByte();
            }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }

        long nextLong() throws IOException {
            int c, sign = 1;
            long val = 0;
            do
                c = readByte();
            while (c <= ' ');
            if (c == '-') {
                sign = -1;
                c = readByte();
            }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }

        String next() throws IOException {
            int c;
            StringBuilder sb = new StringBuilder();
            do
                c = readByte();
            while (c <= ' ');
            while (c > ' ') {
                sb.append((char) c);
                c = readByte();
            }
            return sb.toString();
        }
    }

    //main
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = 1;
        // int t = fs.nextInt(); // uncomment if multiple test cases

        while (t-- > 0) {
            solve(fs, out);
        }

        System.out.print(out.toString());
    }

    // solve
    static void solve(FastScanner fs, StringBuilder out) throws Exception {
        // int n = fs.nextInt();
        // out.append(n).append('\n');

        int n = fs.nextInt();
        //brute
        // n = n-1;
        // int []arr = new int[n];
        // for(int i = 0; i<n; i++) {
        //     arr[i] = fs.nextInt();
        // }
        // if(n==1){
        //     if(arr[0]==1) out.append(arr[0] +1).append('\n');
        //     else out.append(1).append('\n');
        // } else {
        //     Arrays.sort(arr);
        //     int i = 1;
        //     boolean chng = false;
        //     while(i<n){
        //         if(arr[i]-arr[i-1] != 1) {out.append(arr[i]-1).append('\n'); chng = true;}
        //         i++;
        //     }
        //     if(arr[0]!=1) out.append(1).append('\n');

        //     if(!chng) out.append(arr[n-1]+1).append('\n');
        // }

        //using array
        // boolean[] arr = new boolean[n+1];
        // for(int i = 1; i<n; i++) {
        //     arr[fs.nextInt()] = true;
        // }

        // for(int i = 1; i<arr.length; i++){
        //     if(!arr[i]) out.append(i).append('\n');
        // }

        //returm sum till n - input sums;

        long tot = 0;
        for(int i = 1; i<=n; i++) tot+=i;

        long sum = 0;
        for(int i = 1; i<n; i++) sum+=fs.nextInt();
        
        out.append(tot-sum).append('\n');
    }
}