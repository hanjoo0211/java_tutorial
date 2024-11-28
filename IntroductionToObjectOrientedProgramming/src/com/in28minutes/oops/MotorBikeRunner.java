package com.in28minutes.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        honda.setSpeed(80);

        ducati.start();
        honda.start();

        System.out.printf("Ducati speed: %d\n", ducati.getSpeed());
        System.out.printf("Honda speed: %d\n", honda.getSpeed());

        ducati.increaseSpeed(50);
        honda.increaseSpeed(20);

        System.out.printf("Ducati speed: %d\n", ducati.getSpeed());
        System.out.printf("Honda speed: %d\n", honda.getSpeed());

        ducati.decreaseSpeed(300);
        honda.decreaseSpeed(100);

        System.out.printf("Ducati speed: %d\n", ducati.getSpeed());
        System.out.printf("Honda speed: %d\n", honda.getSpeed());
    }
}
