public class HigherInteger {

    public static void main(String[] args) {

        int res = max(10, 5);
        System.out.println(res);
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}





