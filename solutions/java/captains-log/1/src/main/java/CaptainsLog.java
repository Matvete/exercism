import java.util.Random;
import java.util.concurrent.RecursiveTask;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass()
    {
        char[] planetTypes = {'D','H','J','K','L','M','N','R','T','Y'};
        return planetTypes[random.nextInt(planetTypes.length)];
    }

    String randomShipRegistryNumber() {
        return String.format("NCC-%d",1000 + random.nextInt(9000));
    }

    double randomStardate() {
        return 41000.0 + random.nextDouble(1000);
    }
}
