package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        Car[][] car = new Car[r.nextInt(5)][r.nextInt(5)];
        for (int i = 0; i < car.length; i++) {
            for (int k= 0; k < car[i].length; ++k) {
                car[i][k] = new Car(r.nextInt(10),r.nextInt(60)+1958,new Engine(r.nextInt(12)+2),new Rudder(r.nextInt(20)));
            }
        }
        for (int i = 0; i < car.length; i++) {
            for (int k= 0; k < car[i].length; ++k) {
                System.out.print(car[i][k] + " ");
            }
        }
        System.out.println(Arrays.deepToString(car));
        boolean quite = false;

        while (!quite) {

            System.out.println("\n\n1. Show cars. \n2. Fill all cars from one. \nq. Exit.");

            switch (scanner.nextLine()) {

                case "q":

                    quite = true;
                    break;

                case "1":

                    System.out.println(Arrays.deepToString(car));
                    break;

                case "2":

                    Car etalon = new Car(15,1987,new Engine(12),new Rudder(17));

                    for (int i = 0; i < car.length; ++i)
                        Arrays.fill(car[i], etalon);

                    System.out.println("Complete!");
                    break;

                default:

                    System.out.println("Wrong input, please try again!");
                    break;
            }
        }

        // ~
        scanner.close();

    }

}
