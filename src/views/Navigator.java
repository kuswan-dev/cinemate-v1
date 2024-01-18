package views;

import java.util.Stack;

public class Navigator {
    static Stack<Screen> history = new Stack<>();

    public static void goTo(Screen screen) {
        history.push(screen);
        screen.start();
    }

    public static void back() {
        history.pop();
        Screen previousScreen = history.peek();
        previousScreen.start();
    }
}
