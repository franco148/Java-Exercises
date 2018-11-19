package org.avantica.course.utilities;

public class Config {

    public static final String NAME = "APP_NAME";
    public static final int MAX_COLUMN_COUNT = 5;

    public static void printConfig() {
        System.out.println("name= " + NAME + " columnCount= " + MAX_COLUMN_COUNT);
    }
}
