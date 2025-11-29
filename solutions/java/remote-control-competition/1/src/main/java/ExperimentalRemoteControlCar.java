public class ExperimentalRemoteControlCar implements RemoteControlCar{

    private int distance = 0;
    private final int unitsPerDrive = 20;

    @Override
    public void drive()
    {
        distance += unitsPerDrive;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }
}
