package loops;

public class loopBreak {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 11 == 0) {
                break;

            }
            System.out.println(i);
        }
    }
}
