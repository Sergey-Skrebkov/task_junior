package org.example;

public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            Transport transport = getTransport(arg);
            if(transport != null){
                transport.getInfo();
            } else {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
            }
        }
    }

    private static Transport getTransport(String type) {
        Transport transport = null;
        switch (type) {
            case "0":
                transport = new Motorbike();
                break;
            case "1":
                transport = new Scouter();
                break;
            case "2":
                transport = new Car();
                break;
            case "3":
                transport = new Bus();
                break;

        }
        return transport;
    }
}