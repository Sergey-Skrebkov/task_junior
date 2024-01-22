package org.example;

public class Car implements Transport{
    private final static String NAME = "автомобиль";
    private final static double MAX_SPEED = 150;
    private final static int NUMBER_OF_WHEELS = 4;
    private final static String FOR_FAMILY = "Да";

    @Override
    public void getInfo() {
        System.out.println("Наименование транспорта: " + NAME +
                "\nКол-во колес: " + NUMBER_OF_WHEELS +
                "\nМаксимальная скорость: " + MAX_SPEED +
                "\nУдобен для семьи: " + FOR_FAMILY);
    }
}
