package spingProjectCode;

public class ClassicalMusic implements Music {
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Do my Destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public String WhySingSong() {
        return null;
    }

    @Override
    public String WhereWillBeConsert() {
        return "Los Angeles";
    }

    @Override
    public int HowManyPaper() {
        return 2500;
    }

    @Override
    public int HowManyHoursTheConsert() {
        return 5;
    }


}
