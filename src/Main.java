public class Main {
    public static void main(String[] args) {
        //task1
        int age = 23;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //task2
        int temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //task3
        int speed = 89;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //task4
        int age1 = 56;
        if (age1 >= 2 && age1 < 6){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else {
            if (age1 >= 7 && age1 < 17) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
            } else {
                if (age1 >= 18 && age1 < 24) {
                    System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
                } else {
                    if (age1 > 24) {
                        System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
                    }
                }
            }
        }

        //task5
        int ageChild = 7;
        if (ageChild < 5){
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else {
            if (ageChild >= 5 && ageChild < 14) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого");
            } else {
                if (ageChild >= 14) {
                    System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого");
                }
            }
        }

        //task6
        int capacity = 102;
        int seat = 60;
        int engaged = 65;
        if (engaged >= 0 && engaged <60 ) {
            seat = seat - engaged;
            capacity = capacity - engaged;
            System.out.println("Всего свободных мест " + capacity + ", из них " + seat + " свободно сидячих");

        } else {
            if (engaged > 60 && engaged < 102) {
                    System.out.println("Остались только стоячие места");
                } else {
                System.out.println("Мест нет! Никаких!");
            }
        }

        //task7
        int one = 5;
        int two = 8;
        int three = 56;
        if (one > two && one > three) {
            System.out.println(one + " - самое большое");
        } else {
            if (two > one && two > three){
                System.out.println(two + " - самое большое");
            } else {
                System.out.println(three + " - самое большое");
            }
        }
    }

}