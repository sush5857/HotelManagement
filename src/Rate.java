public class Rate {
    private final int weekdayRate;
    private final int weekendRate;

    public Rate(int weekdayRate, int weekendRate) {
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    public int getWeekdayRate() {
        return weekdayRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }
}

