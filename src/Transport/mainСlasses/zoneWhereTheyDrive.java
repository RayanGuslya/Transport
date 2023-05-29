package Transport.mainСlasses;

public abstract class zoneWhereTheyDrive {
    public  String nameCrew;
    public int crew;
    public abstract void zone();
    public int getCrew(){
        return crew;
    }
    public void setCrew(int crew){
        this.crew = crew;
    }
    public String getNameCrew(){
        return nameCrew;
    }
    public void setNameCrew(String nameCrew){
        this.nameCrew = nameCrew;
    }
}
