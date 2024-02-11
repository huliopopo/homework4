public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 10;
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }
        //Задача 2
        int temper = 6;
        if (temper < 5) {
            System.out.println("На улице " + temper + " градусов,нужно надеть шапку");
        }
        if (temper > 5) {
            System.out.println("На улице " + temper + " градусов,можно идти без шапки");
        }
        //Задача 3
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        //Задача 4
        int agee = 50;
        if (agee >= 2 && agee <= 6) {
            System.out.println("Если возраст человека равен " + agee + ", то ему нужно ходить в десткий сад");
        } else if (agee > 6 && agee < 18) {
            System.out.println("Если возраст человека равен " + agee + ", то ему нужно ходить в школу");
        } else if (agee >= 18 && agee <= 24) {
            System.out.println("Если возраст человека равен " + agee + ", то ему нужно ходить в университет");
        } else if (agee > 24) {
            System.out.println("Если возраст человека равен " + agee + ", то ему пора ходить на работу");
        }
        //Задача 5
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нелья кататься на аттракционе");
        } else if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то кататься со взрослым");
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то можно кататься без взрослого");
        }
        //Задача 6
        int capacity = 102;
        int capacityStay = 60;
        int capacitySit = capacity - capacityStay;
        int stayTicket = 2;
        int sitTicket = 9;
        if (stayTicket + sitTicket > capacity && stayTicket > capacityStay && sitTicket > capacitySit) {
            System.out.println("В вагоне нет мест");
        } else if (stayTicket < capacityStay && sitTicket < capacitySit) {
            System.out.println("Есть стоячие и сидячие места");
        } else if (stayTicket < capacityStay) {
            System.out.println("Есть стоячие места");
        } else if (sitTicket < capacitySit) {
            System.out.println("Есть сидячие места");
        }
        //Задача 7
        int one = 50;
        int two = 10;
        int three = 60;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else if (three > one && three > two) {
            System.out.println(three);
        }


    }


}
