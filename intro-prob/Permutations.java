import java.io.IOException;
import java.io.InputStream;

public class Permutations{
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
        
        //it is n^2 not n beacuse insert shifts elemnts to right in every insertion and make the tc n^2
        int n = fs.nextInt();
        if(n==2 || n==3)  out.append("NO SOLUTION").append(' ');
        else {
            //method 1
            // int firsthalf = (int)Math.ceil(n/2.0);
            // int sechalf = n;
            // while(firsthalf>=1 && sechalf>(int)Math.ceil(n/2.0)){
            //     out.insert(0, firsthalf--);
            //     out.insert(0, ' ');
            //     out.insert(0, sechalf--);
            //     out.insert(0, ' ');
            // }
            // if(firsthalf>=1)out.insert(0, 1);

            //method 2(same logic as method 1 but with good code and n tc)
            for(int i = n/2; i>=1; i--) {
                out.append(i).append(" ").append(i+n/2).append(" ");
            }
            if(n%2!=0) out.append(n).append(" ");
       
           
            //method 3
            //for(int i = 2; i<=n; i+=2) out.append(i).append(' ');
            //for(int i = 1; i<=n; i+=2) out.append(i).append(' ');
        }
        
    }
}