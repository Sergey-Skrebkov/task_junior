package org.example;

public class Scouter implements Transport {
    private final static String NAME = "автомобиль";
    private final static double MAX_SPEED = 25;
    private final static int NUMBER_OF_WHEELS = 1;
    private final static boolean DONT_NEED_RIGHTS = true;

    @Override
    public void getInfo() {
        System.out.println("Наименование транспорта: " + NAME +
                "\nКол-во колес: " + NUMBER_OF_WHEELS +
                "\nМаксимальная скорость: " + MAX_SPEED +
                "\nНе нужны права: " + (DONT_NEED_RIGHTS ? "Не нужны права" : "Нужны права"));
    }
}
