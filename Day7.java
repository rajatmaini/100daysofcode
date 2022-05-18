
public class trys {
    public static void main(String[] args) {
        int m = 30, k = 15, n = 0, s = 1, w = 1, e = 4;
        if (m <= s * k) {
            System.out.println(m);
        } else if (m <= (s * k + w + e))
        {
            System.out.println(s*k+(m-s*k)*k);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
