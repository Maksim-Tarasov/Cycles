public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
    }

    public static void firstTask() {
        System.out.println("задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public static void secondTask() {
        System.out.println("задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }

    public static void thirdTask() {
        System.out.println("задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

    }

    public static void fourthTask() {
        System.out.println("задание 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void fifthTask() {
        System.out.println("задание 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(+i + "год является високосным");
        }
    }

    public static void sixthTask() {
        System.out.println("задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

    }

    public static void seventhTask() {
        System.out.println("задание 7");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println(i);

    }
}
