//javac Main2 
//java Main2 < input.txt
//java Main < input.txt > output.txt

package templates; //remove before submitting
import java.io.*;
import java.util.*;

public class Main2 {

    // main
    public static void main(String[] args) throws Exception {
        FastReader fr = new FastReader();
        StringBuilder out = new StringBuilder();

        int t = 1;
        // t = fr.nextInt(); // uncomment if multiple test cases

        while (t-- > 0) {
            solve(fr, out);
        }

        System.out.print(out.toString());
    }

    //my solution
    static void solve(FastReader fr, StringBuilder out) throws Exception {
        // int n = fr.nextInt(); //take input
        // out.append(n).append('\n'); //store and print output and add new line afterwards
      
    }

    //for fast input stringreader and string tokenizer 
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double readDouble() throws IOException {
            return Double.parseDouble(next());
        }

        char readChar() throws IOException {
            return next().charAt(0);
        }

        String readLine() throws IOException {
            return br.readLine();
        }
    }
}
