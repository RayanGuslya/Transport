package Transport.mainСlasses;

import Transport.MilitaryTechnics.T50;
import Transport.PublicTransport.Bus;

public class Main {
    public static void main(String[] args){
        System.out.println("Tank:");
        T50 t50 = new T50();
        t50.setCrew(4);
        t50.crew();
        t50.numbers();
        t50.speed(30);
        t50.drive();
        t50.zone();
        System.out.println(t50);
        System.out.println();

        System.out.println("Bus:");
        Bus bus = new Bus();
        bus.numbers();
        bus.setCrew(1);
        bus.speed(90);
        bus.zone();
        bus.drive();
        bus.crew();
        System.out.println(bus);
    }
}
