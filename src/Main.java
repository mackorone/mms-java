package src;

import src.API;

public class Main {

    private static void log(String text) {
        System.err.println(text);
    }

    public static void main(String[] args) {
        Main.log("Running...");
        API.setColor(0, 0, 'G');
        API.setText(0, 0, "abc");
        while (true) {
            if (!API.wallLeft()) {
                API.turnLeft();
            }
            while (API.wallFront()) {
                API.turnRight();
            }
            API.moveForward();
        }
    }

}
