import java.io.Console;

public class Silnia {
        private static int silnia(int i) {
            if (i < 1)
                return 1;
            else
                return i * silnia(i - 1);
        }
    public static void main(String[] args) {

        int n = 4;

        System.out.println(n + "! = " + silnia(n));
    }
}
