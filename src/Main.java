import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача-1");
        int[] arr = generateRandomArray();


        System.out.println("первый вариант");
        int sum1 = 0;
        for (int j = 0; j < arr.length; j++) {
            sum1 += arr[j];
        }
        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей");


        System.out.println("второй вариант");
        int sum2 = 0;
        for (int k : arr) {//использовал цикл for each.
            sum2 += k;
        }
        System.out.println("Сумма трат за месяц составила " + sum2 + " рублей");


        System.out.println("третий вариант");
        int sum3 = Arrays.stream(arr).sum(); // использовал метод: Arrays.stream()
        System.out.println("Сумма трат за месяц составила " + sum3 + " рублей");

    }

    public static void task2() {
        System.out.println("Задача-2");
        int[] arr = generateRandomArray();

        System.out.println("первый вариант");
        int maximumSpend1 = -1;
        int minimumSpend1 = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > maximumSpend1) {
                maximumSpend1 = arr[j];
            }
            if (arr[j] < minimumSpend1) {
                minimumSpend1 = arr[j];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumSpend1 + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximumSpend1 + " рублей");

        System.out.println("второй вариант");
        int maximumSpend2 = -1;
        int minimumSpend2 = arr[0];
        Arrays.sort(arr); //использовал метод Arrays.sort(arr) для сортировки
        for (int i = 0; i < arr.length; i++) {
            maximumSpend2 = arr[i];
            minimumSpend2 = arr[0];
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumSpend2 + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximumSpend2 + " рублей");

    }

    public static void task3() {
        System.out.println("Задача-3");
        int[] arr = generateRandomArray();

        System.out.println("первый вариант");
        double sum1 = 0;
        double average1;
        for (int j = 0; j < arr.length; j++) {
            sum1 += arr[j];
        }
        average1 = sum1 / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average1 + " рублей");

        System.out.println("второй вариант");
        double sum2 = 0;
        double average2;
        for (int k : arr) {//использовал цикл for each.
            sum2 += k;
        }
        average2 = sum2 / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average2 + " рублей");

        System.out.println("третий вариант");
        double average3;
        double sum3 = Arrays.stream(arr).sum(); // использовал метод: Arrays.stream()

        average3 = sum3 / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average3 + " рублей");

    }

    public static void task4() {
        System.out.println("Задача-4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}