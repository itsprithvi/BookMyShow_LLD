package models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Getter
@Setter
public class Booking extends BaseModel{ // ticket

    private List<ShowSeat> showSeats;
    private User user;
    private double amount;
    private List<Payment> payments;
    private BookingStatus bookingStatus;

}
