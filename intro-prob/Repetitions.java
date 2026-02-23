import java.io.IOException;
import java.io.InputStream;

public class Repetitions {
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

        long n = fs.nextLong();
        out.append(n).append(' ');
        // System.out.println((n*3)+1+ " num ");
        while(n!=1){
            if((n&1 )== 0) {
                n/=2;
                out.append(n).append(' ');
            } 
            else {
                n=(n*3)+1;
                out.append(n).append(' ');
            }
            
        }
        out.append('\n');
    }
}
