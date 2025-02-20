package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println(hasTeen(9, 99, 19));   // true
        System.out.println(hasTeen(23, 15, 42));  // true
        System.out.println(hasTeen(22, 23, 34));  // false

        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true

        Scanner scanner = new Scanner(System.in);

        // Dikdörtgenin alanını hesapla
        System.out.print("Dikdörtgenin uzunluğunu girin: ");
        double length = scanner.nextDouble();
        System.out.print("Dikdörtgenin genişliğini girin: ");
        double width = scanner.nextDouble();
        System.out.println("Dikdörtgenin alanı: " + area(length, width));

        // Dairenin alanını hesapla
        System.out.print("Dairenin yarıçapını girin: ");
        double radius = scanner.nextDouble();
        System.out.println("Dairenin alanı: " + area(radius));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
       if(clock<0 || clock>23 || !isBarking){
           return false;
       }
       return clock >= 20 || clock < 8 ;
    }

    public static boolean hasTeen(int a, int b, int c) {
         return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer) {
             return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    public static double area(double length, double width) {
        if (length < 0 || width < 0) {
            return -1;
        }
        return length * width;
    }

   public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
