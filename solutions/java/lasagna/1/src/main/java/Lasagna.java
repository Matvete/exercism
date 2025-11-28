public class Lasagna {

    public int expectedMinutesInOven()
    {
        return 40;
    }

    public int remainingMinutesInOven(int timeInOven)
    {
        return this.expectedMinutesInOven() - timeInOven;
    }

    public int preparationTimeInMinutes(int layersPut)
    {
        return layersPut *2; //minutes
    }

    public int totalTimeInMinutes(int layersPut,int timeInOven)
    {
        return this.preparationTimeInMinutes(layersPut) + timeInOven;
    }
}
