import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String order = scanner.next();

        // Rank of each lowercase letter
        int[] rank = new int[26];

        for (int i = 0; i < 26; i++) {
            rank[order.charAt(i) - 'a'] = i;
        }

        int n = scanner.nextInt();
        String[] v = new String[n];

        for (int i = 0; i < n; i++) {
            v[i] = scanner.next();
        }

        // Sort using custom alphabet order
        Arrays.sort(v, (a, b) -> {
            int len = Math.min(a.length(), b.length());

            for (int i = 0; i < len; i++) {
                char x = a.charAt(i);
                char y = b.charAt(i);

                if (x == y) {
                    continue;
                }

                // Uppercase is always greater than lowercase
                if (Character.isLowerCase(x) && Character.isUpperCase(y)) {
                    return -1;
                }

                if (Character.isUpperCase(x) && Character.isLowerCase(y)) {
                    return 1;
                }

                // Both are the same case. Compare using the custom alphabet.
                char lx = Character.toLowerCase(x);
                char ly = Character.toLowerCase(y);

                return rank[lx - 'a'] - rank[ly - 'a'];
            }

            // If one is a prefix of the other, the shorter string comes first.
            return Integer.compare(a.length(), b.length());
        });

        for (String s : v) {
            System.out.println(s);
        }

        scanner.close();
    }
}
