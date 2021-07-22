import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int even;
    public static int odd;


    //Task 2,3

    public static class Man {
        public Woman wife;
    }

    public static class Woman {
        public Man husband;
    }

    //Task 4

    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    //Task 5

    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }

    //Task 6

    public static String multiplicationTable(int number) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result = +i * number + " ";
        }
        return result;
    }

    //Task 7

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applesPrice += applesPrice;
        }
    }

    //Task 8, 10

    public static class Human {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public void setName(String name) {
            this.name = name;
        }
    }

    //Task 9
    public static void checkSeason(int month) {
        if (month == 12) {
            System.out.println("Зима");
        } else if (month == 1) {
            System.out.println("Зима");
        } else if (month == 2) {
            System.out.println("Зима");
        } else if (month == 3) {
            System.out.println("Весна");
        } else if (month == 4) {
            System.out.println("Весна");
        } else if (month == 5) {
            System.out.println("Весна");
        }
        ;

        switch (month) {
            case 6:
            case 7:
            case 8:
                System.out.println("Літо");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осінь");
                break;
        }

        if (month < 1 || month > 12) {
            System.out.println("Такого місяця не існує");
        }
    }

    //Task 11

    public static class Dog {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    //Task 14

    public static int[] getArray() throws IOException {
        int[] array = new int[10];
        System.out.println("Заповніть масив 10 числами");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) throws IOException {

//      Task 1

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " " + "JAVA HOME");
        }

//      Task 2

        Man man = new Man();
        Woman woman = new Woman();

//      Task 3

        man.wife = woman;
        woman.husband = man;

//      Task 4

        System.out.println(min(5, 20));
        System.out.println(min(17, -3));
        System.out.println(min(-4, -9));

//      Task 5

        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(3));

//      Task 6

        System.out.println(multiplicationTable(1));
        System.out.println(multiplicationTable(2));
        System.out.println(multiplicationTable(3));
        System.out.println(multiplicationTable(4));
        System.out.println(multiplicationTable(5));
        System.out.println(multiplicationTable(6));
        System.out.println(multiplicationTable(7));
        System.out.println(multiplicationTable(8));
        System.out.println(multiplicationTable(9));
        System.out.println(multiplicationTable(10));

//      Task 7

        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);

//      Task 8

        Human human = new Human();
        human.setName("Jon");
        System.out.println(human.name);

//      Task 9

        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        checkSeason(15);

//      Task 12

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        boolean equality = false;
        String text = "The max is ";

        System.out.println("Введіть перше число:");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введіть друге число");
        int b = Integer.parseInt(reader.readLine());
        if (a < b)
            max = b;
        else if (a > b)
            max = a;
        else
            equality = true;

        if (equality == true) {
            System.out.println("Числа рівні між собою");
        } else {
            System.out.println(text + max);
        }

//      Task 13

        System.out.println("Введіть додатнє число:");
        int number = Integer.parseInt(reader.readLine());
        while (number != 0) {
            int n = number % 2;
            if (n == 0) {
                number = number / 10;
                even++;
            } else {
                number = number / 10;
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);

//        Task 14

        int[] array = getArray();
        int maxArray = max(array);
        System.out.println(maxArray);
    }
}
