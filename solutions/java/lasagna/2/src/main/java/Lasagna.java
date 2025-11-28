public class Lasagna {

    public static final int LASAGNA_EXPECTED_TIME_IN_OVEN = 40;
    public static final int EXPECTED_MINUTES_PER_LAYER = 2;
    public int expectedMinutesInOven()
    {
        return LASAGNA_EXPECTED_TIME_IN_OVEN;
    }

    public int remainingMinutesInOven(int timeInOven)
    {
        return this.expectedMinutesInOven() - timeInOven;
    }

    public int preparationTimeInMinutes(int layersPut)
    {
        return layersPut * EXPECTED_MINUTES_PER_LAYER; //minutes
    }

    public int totalTimeInMinutes(int layersPut,int timeInOven)
    {
        return this.preparationTimeInMinutes(layersPut) + timeInOven;
    }
}
