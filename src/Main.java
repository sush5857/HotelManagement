import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hotel> hotels = Arrays.asList(
                new Hotel("Miami Beach", new Rate(80, 110), new Rate(50, 90), 4),
                new Hotel("Miami Downtown", new Rate(120, 90), new Rate(100, 80), 3),
                new Hotel("Miami Midtown", new Rate(100, 150), new Rate(70, 130), 5)
        );

        HotelFinder hotelFinder = new HotelFinder(hotels);

        CustomerType customerType = CustomerType.REGULAR;
        List<DayType> dayTypes = Arrays.asList(DayType.WEEKDAY, DayType.WEEKEND, DayType.WEEKEND);

        Hotel cheapestHotel = hotelFinder.findCheapestHotel(customerType, dayTypes);

        System.out.println("Cheapest hotel: " + cheapestHotel.getName());
    }
}
