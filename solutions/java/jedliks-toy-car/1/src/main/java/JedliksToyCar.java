public class JedliksToyCar {
    private int battery = 100;
    private int drivenMeters = 0;
    private final int METERS_PER_ONE_PERCENT = 20;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + drivenMeters + " meters";
    }

    public String batteryDisplay() {
        return battery > 0 ? "Battery at " + battery + "%":"Battery empty";
    }

    public void drive() {
        if(battery > 0)
        {
            battery--;
            drivenMeters += METERS_PER_ONE_PERCENT;
        }
    }
}
