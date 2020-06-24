package spingProjectCode;

public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "loseyourself, notAfraid,GodZila,Stan,MyNameIs";
    }

    @Override
    public String WhySingSong() {
        return "Eminem";
    }

    @Override
    public String WhereWillBeConsert() {
        return "New York";
    }

    @Override
    public int HowManyPaper() {
        return 5000;
    }

    @Override
    public int HowManyHoursTheConsert() {
        return 2;
    }
}
