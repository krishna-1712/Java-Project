public class Method_overloading {
    static int Addition(int a) {
        return a + a;

    }

    static int Addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b == 0) {
            System.out.println(Addition(a));
        } else {
            System.out.println(Addition(a, b));
        }

    }
}