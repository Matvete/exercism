public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int mileage = 0;
    private final int speed = 10;
    private int victories = 0;
    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
       this.victories = numberOfVictories;
    }

    @Override
    public void drive()
    {
        mileage += speed;
    }

    @Override
    public int getDistanceTravelled() {
        return mileage;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return -(this.getNumberOfVictories() - o.getNumberOfVictories());
    }
}
