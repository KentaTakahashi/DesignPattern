package Exercises.ch02_Adapter.ex02_02;

import java.io.IOException;

public class Main {

    static final String inputFile  = "src/Exercises/ch02_Adapter/ex02_02/file.txt";
    static final String outputFile = "src/Exercises/ch02_Adapter/ex02_02/newfile.txt";

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile(inputFile);
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
