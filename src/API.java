package src;

import java.util.Scanner;

public class API {

    private static String getString(String command) {
        System.out.println(command);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return response;
    }

    private static int getInteger(String command) {
        String response = getString(command);
        return Integer.parseInt(response);
    }

    private static boolean getBoolean(String command) {
        String response = getString(command);
        return response.equals("true");
    }

    private static boolean getAck(String command) {
        String response = getString(command);
        return response.equals("ack");
    }

    public static int mazeWidth() {
        return API.getInteger("mazeWidth");
    }

    public static int mazeHeight() {
        return API.getInteger("mazeHeight");
    }

    public static boolean wallFront() {
        return API.getBoolean("wallFront");
    }

    public static boolean wallRight() {
        return API.getBoolean("wallRight");
    }

    public static boolean wallLeft() {
        return API.getBoolean("wallLeft");
    }

    public static void moveForward() {
        boolean ack = API.getAck("moveForward");
        if (!ack) {
            throw new RuntimeException("Cannot move forward");
        }
    }

    public static void turnRight() {
        API.getAck("turnRight");
    }

    public static void turnLeft() {
        API.getAck("turnLeft");
    }

    public static void setWall(int x, int y, char direction) {
        System.out.println("setWall " + x + " " + y + " " + direction);
    }

    public static void clearWall(int x, int y, char direction) {
        System.out.println("clearWall " + x + " " + y + " " + direction);
    }

    public static void setColor(int x, int y, char color) {
        System.out.println("setColor " + x + " " + y + " " + color);
    }

    public static void clearColor(int x, int y) {
        System.out.println("clearColor " + x + " " + y);
    }

    public static void clearAllColor() {
        System.out.println("clearAllColor");
    }

    public static void setText(int x, int y, String text) {
        System.out.println("setText " + x + " " + y + " " + text);
    }

    public static void clearText(int x, int y) {
        System.out.println("clearText " + x + " " + y);
    }

    public static void clearAllText() {
        System.out.println("clearAllText");
    }

    public static boolean wasReset() {
        return API.getBoolean("wasReset");
    }

    public static void ackReset() {
        API.getAck("ackReset");
    }

}
