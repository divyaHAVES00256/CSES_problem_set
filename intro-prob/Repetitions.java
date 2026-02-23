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

        String s = fs.next();

        // int l = 0;
        // int r = 1;
        // int ans = 1;
        // while(r<s.length()){
        //     if(s.charAt(r) == s.charAt(r-1)){
        //         ans = Math.max(ans, r-l+1);
        //     } else l = r;
        //     r++;
        // }
        // out.append(ans).append('\n');

        int curr = 1;
        int ans = 1;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i-1)!=s.charAt(i)) curr=0;
            curr++;
            ans  = Math.max(ans, curr);
        }
        out.append(ans).append('\n');
    }
}
