public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int j = 100;
        while (j > 0) {
            boolean even = j % 2 == 0;

            if (even) {
                j = j/2;
            }
            else {
                j--;
            }
            count++;
        }
        System.out.println(count);

    }
}
