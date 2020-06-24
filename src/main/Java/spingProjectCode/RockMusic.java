package spingProjectCode;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary, Hey Joe, Foxy Lady, Machine Gun, Red House";
    }

    @Override
    public String WhySingSong() {
        return "Jimi Hendrix";
    }

    @Override
    public String WhereWillBeConsert() {
        return "California";
    }

    @Override
    public int HowManyPaper() {
        return 2000;
    }

    @Override
    public int HowManyHoursTheConsert() {
        return 3;
    }
}
