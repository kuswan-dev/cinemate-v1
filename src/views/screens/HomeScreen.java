package views.screens;

import utils.Menu;
import views.Navigator;
import views.Screen;

public class HomeScreen extends Screen {
    @Override
    public void start() {
        System.out.println("Home Screen");

        String[] menus = { "Popular Movies", "Search Movie", "Exit" };
        int selectedMenu = Menu.showAndSelectMenu(menus, "What do you wan't to do? ");
        switch (selectedMenu) {
            case 1:
                Navigator.goTo(new PopularMoviesScreen());
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
