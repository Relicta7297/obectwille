package ru.manavaz.objectwille.consoleUI.utils;

import java.io.*;

public class ConsoleHelper {
    public static int readChoice() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String s = bufferedReader.readLine();
            return Integer.parseInt(s);
        } catch (IOException e) {
            System.out.println("Ну ой");
           // e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Введенно не число, \"гений\"");
           // e.printStackTrace();
        }
        return -1;
    }

}
