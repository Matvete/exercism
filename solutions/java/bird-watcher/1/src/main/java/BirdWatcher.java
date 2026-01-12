
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] LAST_WEEKS_LOG = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return LAST_WEEKS_LOG;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] ++;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;

        for(int i: birdsPerDay)
        {
            hasDayWithoutBirds = i == 0;
            if(hasDayWithoutBirds) break;
        }

        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        numberOfDays = Math.min(numberOfDays, birdsPerDay.length);
        int sum = 0;

        for(int i = 0;i<numberOfDays;i++)
        {
            sum += birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays()
    {
        int busyDaysCount = 0;

        for(int i: birdsPerDay)
        {
            if(i>=5) busyDaysCount++;
        }

        return busyDaysCount;
    }
}
