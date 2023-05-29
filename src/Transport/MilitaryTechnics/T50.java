package Transport.MilitaryTechnics;
import Transport.mainСlasses.base;
import Transport.mainСlasses.zoneWhereTheyDrive;

public class T50 extends zoneWhereTheyDrive implements base{
    int speed = 30;
    private String numbers;
    {
        speed=0;
        numbers = "No numbers";
    }
    @Override
    public void numbers(){
        System.out.println(numbers);
    }
    public  void nameCrew(){
        nameCrew = "military" + " " + nameCrew;
    }
    public void crew(){
        System.out.println("Кол-во экипажа " + crew);
    }
    @Override
    public void zone(){
        System.out.println("zone: at the military base");
    }
    @Override
    public void speed(int speed){
        this.speed = speed;
    }
    @Override
    public void drive(){
        System.out.println("T50, tank rides on tracks");
    }
    @Override
    public String toString(){
        return "Speed tanks " + speed;
    }
}
