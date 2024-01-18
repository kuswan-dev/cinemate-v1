package views.screens;

import views.Navigator;
import views.Screen;

public class MovieDetailScreen extends Screen {
    @Override
    public void start() {
        System.out.println("Movie Detail Screen");
        Navigator.goTo(new BookingTicketScreen());
    }
}
