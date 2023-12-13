package models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Getter
@Setter
@Entity
public class Booking extends BaseModel{ // ticket

    @ManyToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private User user;
    private double amount;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

}

// Defining cardinality

/*
*       1    ->     M
*    Booking  -  ShowSeat   M : M
*       M    <-     1
*
*       1    ->    1
*    Booking  -   User   M : 1
*       M    <-    1
*
*      1    ->      M
*    Booking  -   Payment   1 : M
*      1    <-      1
*
*       1    ->    M
*    Booking   BookingStatus    M : M
*       M    <-    1
*
* */