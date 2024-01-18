package views.screens;

import views.Navigator;
import views.Screen;

public class BookingTicketScreen extends Screen {
    @Override
    public void start() {
        System.out.println("Booking Ticket Screen");
        Navigator.back();
    }
}
