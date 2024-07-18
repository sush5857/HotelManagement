import java.util.*;

public class HotelFinder {
    private final List<Hotel> hotels;

    public HotelFinder(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Hotel findCheapestHotel(CustomerType customerType, List<DayType> dayTypes) {
        return hotels.stream().min((hotel1, hotel2) -> {
                    int rate1 = dayTypes.stream().mapToInt(dayType -> hotel1.getRate(customerType, dayType)).sum();
                    int rate2 = dayTypes.stream().mapToInt(dayType -> hotel2.getRate(customerType, dayType)).sum();
                    if (rate1 == rate2) {
                        return Integer.compare(hotel2.getRating(), hotel1.getRating());
                    }
                    return Integer.compare(rate1, rate2);
                })
                .orElse(null);
    }
}
