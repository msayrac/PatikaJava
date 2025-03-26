package com.msayrac.Second;

public class Main {
    public static void main(String[] args) {

        Vehicle tesla = new Automobile("Tesla", 0, 200);
        Vehicle togg = new Automobile("TOGG", 250, 220);
        Vehicle yamaha = new Motorcycle("Yamaha", 0, 180);

        Vehicle[] raceCars = new Vehicle[3];
        raceCars[0] = tesla;
        raceCars[1] = togg;
        raceCars[2] = yamaha;

        int runWayLength = 1000;
        boolean isRaceCondition = true;
        Vehicle winner = null;

        while (isRaceCondition == true) {
            System.out.println("--------- İlk Hız Artırma ---------");
            for (Vehicle vehicle : raceCars) {

                int randomSpeedAmount = (int) (Math.random() * 30) + 1;
                vehicle.speedUp(randomSpeedAmount);
                vehicle.showSpeed();

                if (vehicle.getDistance() >= runWayLength) {
                    winner = vehicle;
                    isRaceCondition = false;
                    break;
                }
            }
            System.out.println("--------- İlk Hız Artırma Bitti ---------");
            System.out.println("*****************************************");
        }

        System.out.println("---------------------------");
        if(winner instanceof Automobile) {
            ((Automobile) winner).hornSound();
        }
        if(winner instanceof Motorcycle) {
            ((Motorcycle) winner).frontLift();
        }
        System.out.println("Kazanan Araç : "+ winner.make);

    }
}
