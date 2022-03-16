import java.util.Arrays;

public class IPv4 {
    public static void main(String[] args) {
        long result = ipsBetween( "10.0.0.0", "10.0.0.50" );
        System.out.println(result);
    }
    public static long ipsBetween(String start, String end) {
        String[] s = start.split("\\.");
        System.out.println(Arrays.toString(s));
        int S = 0;
        for(int i = 0; i < s.length; i++){
            S = S<<8;
            S += Integer.parseInt(s[i]);
        }

        String[] e = end.split("\\.");
        System.out.println(Arrays.toString(e));
        int E = 0;
        for(int i = 0; i < e.length; i++){
            E = E<<8;
            E += Integer.parseInt(e[i]);
        }
        return E - S;
    }
}
