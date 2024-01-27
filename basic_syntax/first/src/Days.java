enum DaysNames {
    MONDAY(""), TUESDAY(""), WEDNESDAY(""), THURSDAY(""), FRIDAY(""), SATURDAY(""),SUNDAY("");

    public final String description;

    DaysNames(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}

public class Days {
    public static void main(String[] args) {
        DaysNames today = DaysNames.SATURDAY;
        System.out.println(today);
    }



}
