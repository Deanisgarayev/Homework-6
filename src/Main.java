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
        for (int a = 1; a <= 10; a++){
            System.out.println("Итерация числ " + a);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int a = 10; a >=1; a--){
            System.out.println("Итерация числ " + a);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int a = 0; a <= 17; a = a + 2){
            System.out.println("Итерация числ " + a);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int a = 10; a >= -10; a--){
            System.out.println("Итерация числ " + a);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int a = 1904; a <= 2096; a = a + 4){
            System.out.println(a + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int a = 7; a <= 98; a = a + 7){
            System.out.println("Итерация числ " + a);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int a = 1; a <= 512; a = a * 2){
            System.out.println("Итерация числ " + a);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int total = 0;
        int cash =29000;
        for (int a = 1; a <= 12; a++){
            total = total + cash;
            System.out.println("Месяц " + a + " сумма накоплений ровна " + total);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int cash = 29000;
        int total = 0;
        for (int a = 1; a <= 12; a++){
            total = total + cash / 100;
            total = total + cash;
            System.out.println("Месяц " + a + " сумма накоплений ровна " + total);
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int a = 1; a <= 10; a = a + 1){
            int b = a * 2;
            System.out.println("2 * " + a + " = " + b);
            }
        }
    }
