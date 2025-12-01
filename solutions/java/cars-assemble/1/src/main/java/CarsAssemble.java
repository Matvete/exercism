public class CarsAssemble {

    private static final int CARS_PER_SPEED_POINT = 221;
    private static final double[] SPEED_MODIFIERS = {0,
            1.0,1.0,1.0,1.0,//1 to 4 speed - 100%
            0.9,0.9,0.9,0.9,//5 to 8 speed - 90%
            0.8,            //9 speed - 80%
            0.77            //10 speed - 77%
    };

    public double productionRatePerHour(int speed)
    {
        return speed * CARS_PER_SPEED_POINT * SPEED_MODIFIERS[speed];
    }

    public int workingItemsPerMinute(int speed)
    {
        return (int)productionRatePerHour(speed)/60;
    }
}
