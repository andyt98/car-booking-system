package com.amigoscode.booking;

import java.util.ArrayList;
import java.util.List;

public class CarBookingListDataAccessService implements CarBookingDao {

    private final static List<CarBooking> carBookings = new ArrayList<CarBooking>();

    @Override
    public List<CarBooking> getCarBookings() {
        return carBookings;
    }

    @Override
    public void book(CarBooking carBooking) {
        carBookings.add(carBooking);

    }

}
