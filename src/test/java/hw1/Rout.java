package hw1;

public class Rout {
    private String startPoint;
    private String destinationPoint;
    private double distance;

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

   //public boolean checkFuel(Vehicle vehicle) {
   //    if (vehicle.getTankDistance() > distance) {
   //        return true;
   //    } else {
   //        return false;
   //    }
   //}
}
