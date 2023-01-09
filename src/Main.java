/* Решение седьмой домашний работы (7 из 16)
оператор цикла for
09.01.2023
 */
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        //пишем код для задачи 1
        for ( int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        //пишем код для зачади 2
        for ( int b = 10; b > 0; b--) {
            System.out.println(b);
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        //пишем код для задачи 3
        for ( int c = 0; c < 17;  c = c + 2) {
            System.out.println(c);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        //пишем код для задачи 4
        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        //пишем код для задачи 5
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " високосный год");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        //пишем код для задачи 6
        for (int r = 7; r <= 98; r = r + 7) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        //пишем код для задачи 7
        int first = 1;
        System.out.print(first + " ");
        for (int t = 2; t <= 512; t = t * 2){
            System.out.print(t + " ");
        }
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        //пишем код для задачи 8
        int invest = 29000;
        int total = 0;

        for (int s = 1; s <= 12; s++) {
            total = total + invest;
            System.out.println("Месяц " + s + ", сумма " + total);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        //пишем код для задачи 9
        double invest = 29000;
        double total = 0;

        for (int m = 1; m <= 12; m++) {
            invest = invest + invest/100;
            total = total + invest;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task10 () {
        System.out.println("Задача 10");
        //пишем код для задачи 10
        int number = 2;
        int factor = 0;
        int sum;

        for (int n = 0; n < 10; n++ ) {
            factor++;
            sum = number * factor;
            System.out.println(number + " * " + factor + " = " + sum);
        }
    }


}