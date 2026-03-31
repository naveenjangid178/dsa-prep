//find nth magic number
// 1 = 0001 => 5^1 = 5
// 2 = 0010 => 5^2 = 25
// 3 = 0011 => 5^1 + 5^2 = 30
// 4 = 0100 => 5^3 = 125
// 5 = 0101 => 5^1 + 5^3 = 130

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
