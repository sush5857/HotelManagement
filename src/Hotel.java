public class Hotel {
    private final String name;
    private final Rate regularRates;
    private final Rate rewardRates;
    private final int rating;

    public Hotel(String name, Rate regularRates, Rate rewardRates, int rating) {
        this.name = name;
        this.regularRates = regularRates;
        this.rewardRates = rewardRates;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getRate(CustomerType customerType, DayType dayType) {
        if (customerType == CustomerType.REGULAR) {
            if (dayType == DayType.WEEKDAY) {
                return regularRates.getWeekdayRate();
            } else {
                return regularRates.getWeekendRate();
            }
        } else {
            if (dayType == DayType.WEEKDAY) {
                return rewardRates.getWeekdayRate();
            } else {
                return rewardRates.getWeekendRate();
            }
        }
    }
}
