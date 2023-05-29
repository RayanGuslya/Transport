package Transport.PublicTransport;

import Transport.mainСlasses.base;
import Transport.mainСlasses.zoneWhereTheyDrive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bus extends zoneWhereTheyDrive implements base {
    int speed = 90;
    private String numbers = "FF42GA777";
    {
        speed=0;
    }

    @Override
    public void numbers(){
        String regex = "[A-Z][0-9]{3}[A-Z]{2}[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbers);
        if (matcher.matches()) {
            System.out.println("Number car: " + numbers);
        } else System.out.println("numbers car " + numbers+ " error");
    }
    @Override
    public String toString(){
        return "Bus speed " + speed;
    }
    public void crew(){
        System.out.println("Кол-во экипажа " + crew);
    }
    public void nameCrew(){
        nameCrew = "Bus" + " " + nameCrew;
    }
    @Override
    public void zone(){
        System.out.println("zona: in the city");
    }
    @Override
    public void speed(int speed){
        this.speed = speed;
    }
    @Override
    public void drive(){
        System.out.println("bus rides on wheels");
    }
}
