package hw1;

public class Vehicle {
    private double tankCapacity;
    private double averageFuelConsumption;

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

public double getTankDistance () {
        double tankDistance = (tankCapacity/averageFuelConsumption)*100;
        return tankDistance;
}

}
