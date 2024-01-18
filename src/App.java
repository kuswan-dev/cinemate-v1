import views.Navigator;
import views.screens.HomeScreen;

public class App {
    public static void main(String[] args) throws Exception {
        Navigator.goTo(new HomeScreen());
    }
}
