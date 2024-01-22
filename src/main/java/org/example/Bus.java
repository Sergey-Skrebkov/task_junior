package org.example;

public class Bus implements Transport{
    private final static String NAME = "автобус";
    private final static double MAX_SPEED = 100;
    private final static int NUMBER_OF_WHEELS = 6;
    private final static String DESCRIPTION = "Транспорт для большого числа пассажиров";

    @Override
    public void getInfo() {
        System.out.println("Наименование транспорта: " + NAME +
                "\nКол-во колес: " + NUMBER_OF_WHEELS +
                "\nМаксимальная скорость: " + MAX_SPEED +
                "\nОписание: " + DESCRIPTION);
    }
}
