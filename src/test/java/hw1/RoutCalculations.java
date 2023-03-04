package hw1;

import org.junit.jupiter.api.Test;

public class RoutCalculations {
@Test


    public void routCalculations() {


    //Creating new vehicles
        Vehicle car = new Vehicle();
        car.setTankCapacity(60);
        car.setAverageFuelConsumption(6.5);
        car.getTankDistance();

        Vehicle train = new Vehicle();
        train.setTankCapacity(500);
        train.setAverageFuelConsumption(40);
        train.getTankDistance();

        Vehicle plain = new Vehicle();
        plain.setTankCapacity(4000);
        plain.setAverageFuelConsumption(250);
        plain.getTankDistance();

        Vehicle bike = new Vehicle();
        bike.setTankCapacity(10);
        bike.setAverageFuelConsumption(4.5);
        bike.getTankDistance();

        //Create routes
    Rout rout1 = new Rout();
    rout1.setStartPoint("Riga");
    rout1.setDestinationPoint("Liepaja");
    rout1.setDistance(220);

    Rout rout2 = new Rout();
    rout2.setStartPoint("Riga");
    rout2.setDestinationPoint("Zakopane");
    rout2.setDistance(1251);



    System.out.println("Car");
    System.out.println("Tank Capacity:" + car.getTankCapacity() + " L");
    System.out.println("Average Fuel Consumption:" + car.getAverageFuelConsumption() + " L/100 km");
    System.out.println("Tank Distance:" + car.getTankDistance() + " Km");


    System.out.println("Train");
    System.out.println("Tank Capacity:" + train.getTankCapacity() + " L");
    System.out.println("Average Fuel Consumption:" + train.getAverageFuelConsumption() + " L/100 Km");
    System.out.println("Tank Distance:" + train.getTankDistance() + " Km");

    System.out.println("Plain");
    System.out.println("Tank Capacity:" + plain.getTankCapacity() + " L");
    System.out.println("Average Fuel Consumption:" + plain.getAverageFuelConsumption() + " L/100 Km");
    System.out.println("Tank Distance:" + plain.getTankDistance() + " Km");

    System.out.println("Bike");
    System.out.println("Tank Capacity:" + bike.getTankCapacity() + " L");
    System.out.println("Average Fuel Consumption:" + bike.getAverageFuelConsumption() + " L/100 Km");
    System.out.println("Tank Distance:" + bike.getTankDistance() + " Km");


    }

}
