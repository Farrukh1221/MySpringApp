package spingProjectCode;

public class HipHop implements Music {
    @Override
    public String getSong() {
        return "Our time";
    }

    @Override
    public String WhySingSong() {
        return "Oleg Genzov";
    }

    @Override
    public String WhereWillBeConsert() {
        return "Sankt-Peterburg";
    }

    @Override
    public int HowManyPaper() {
        return 4500;
    }

    @Override
    public int HowManyHoursTheConsert() {
        return 1;
    }
}
