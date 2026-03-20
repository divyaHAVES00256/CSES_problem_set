import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Increasing_Array {
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
        // String s = fs.next();

        int n = fs.nextInt();
        long ans = 0;
        int a[] = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = fs.nextInt();
            if(i>0 && a[i]<a[i-1]){
                ans+=(a[i-1]-a[i]); 
                a[i] = a[i-1];
            }
            
        }
       
        out.append(ans).append('\n');
    }
}
