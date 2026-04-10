import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        // pad("", "12");
        System.out.println(letterCombinations("23"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return list;
        }

        helper("", digits, list);
        return list;
    }

    static void helper(String p, String digits, ArrayList<String> list) {
        if (digits.length() == 0) {
            list.add(p);
            return;
        }

        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        int digit = digits.charAt(0) - '0';
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {
            helper(p + letters.charAt(i), digits.substring(1), list);
        }
    }
}