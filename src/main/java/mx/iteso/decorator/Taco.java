package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";
    protected String size = REGULAR;
    public static String MEGA = "Mega";
    public static String MINI = "Mini";
    public static String REGULAR = "Regular";
    
    public String getDescription(){
        return description;
    }
    public String getSize(){
        return size;
    }
    public abstract double cost();

}
