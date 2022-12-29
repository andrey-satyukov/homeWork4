public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        int temperature = 5;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + ", нужно надеть шапку");
        }
    }

    public static void task3() {
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        int age = 7;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        int age = 6;
        if (age <= 5){
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6(){
        int passenger = 50;
        if (passenger < 60){
            System.out.println("В вагоне " + (60 - passenger) + " сидячих мест.");
        } else if (passenger < 102) {
            System.out.println("В вагоне " + (102 - passenger) + " стоячих мест.");
        }
    }
    public static void task7(){
        int one = 55;
        int two = 13;
        int three = 8;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}