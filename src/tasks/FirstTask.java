package tasks;

public class FirstTask {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print("Two");
                if (i % 7 == 0) {
                    System.out.print("Seven");
                }
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}
