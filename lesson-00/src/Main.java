public class Main {
    Main() {
        new Linux();
    }

    public static void main(String[] args) {
        //new Linux();
        //StackOverflowError;


        Linux[][][] l = new Linux[100_000_000][100_000_000][100_000_000];
        for (int i = 0; i < 100_000_000; i++) {
            l[i][i][i] = new Linux();
            System.out.println(l[i][i][i]);

        }
        //OutOfMemoryError;

    }
}
