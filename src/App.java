public class App {
    public static void main(String[] args) throws Exception {
        final int NUMBER = 11;
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < NUMBER ; i++) {
            System.out.printf("%d ",b);
            c = b;
            b = a + b;
            a = c;
        }

        System.out.println("\n");

        int k = 0;
        a = 0;
        b = 1;
        while (k < NUMBER) {
            System.out.printf("%d ",b);
            c = b;
            b = a + b;
            a = c;
            k++;
        }
    }
}
