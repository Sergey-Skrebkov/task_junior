package org.example;

public class Motorbike implements Transport{
    private final static String NAME = "мотоцикл";
    private final static double MAX_SPEED = 180;
    private final static int NUMBER_OF_WHEELS = 2;
    private final static char RIGHTS_CATEGORY = 'A';

    @Override
    public void getInfo() {
        System.out.println("Наименование транспорта: " + NAME +
                "\nКол-во колес: " + NUMBER_OF_WHEELS +
                "\nМаксимальная скорость: " + MAX_SPEED +
                "\nКатегория прав:" + RIGHTS_CATEGORY);
    }
}
