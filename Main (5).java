import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int remainder;

        while (B != 0) {
            remainder = B;
            B = A % B;
            A = remainder;
        }

        System.out.println(A);
    }
}
