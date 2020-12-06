package ru.manavaz.objectwille.consoleUI;

import ru.manavaz.objectwille.consoleUI.utils.ConsoleHelper;

public class ConsoleApp {
    public static void main(String[] args) {
        ConsoleApp ca = new ConsoleApp();
        ca.run();
    }

    public void run(){
        while (true){
            takeMenu();
        }
    }
    private void takeMenu(){
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Выйти");
        int choice = ConsoleHelper.readChoice();
        System.out.println(choice);

        switch (choice){
            case 1:
                System.out.println("начинаем игру!");
                //todo: начать новую игру
                break;
            case 2:
                //todo: coming soon
                break;
            case 3: System.exit(0);
        }
    }


}
