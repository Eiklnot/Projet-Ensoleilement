import java.util.GregorianCalendar;
import java.util.Date;

public class B {

    public int numberOfDays;
    private LocalTime localTime;

    public B(int hour, int minute, int jour, int mois, int annee) {
        GregorianCalendar date = new GregorianCalendar(annee, mois, jour);

        GregorianCalendar firstDay = new GregorianCalendar(annee, 01, 01);
        this.numberOfDays = daysBetween(firstDay.getTime(), date.getTime());
        this.localTime = new LocalTime(hour, minute);
    }

    public int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

    public double get_value() {
        return (2 * Math.PI / 365) * (numberOfDays + ((localTime.get_value() - 12) / 24));
    }
}
