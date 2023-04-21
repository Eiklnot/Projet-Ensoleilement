
/*Dans cet class j'importe le calendrier grégorien
afin de calculer le nombre de jours entre la date demandé et le premier jour de l'année demandé*/

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DeclinationAngle {

    public int numberOfDays;

    // Contructeur de la class DeclinationAngle
    public DeclinationAngle(int jour, int mois, int annee) {
        GregorianCalendar date = new GregorianCalendar(annee, mois, jour);
        GregorianCalendar firstDay = new GregorianCalendar(annee, 1, 1);

        this.numberOfDays = daysBetween(firstDay.getTime(), date.getTime());
    }

    /*
     * cet equation nous permet de calculer entre la date demandé et le premier jour
     * de l'année demandé
     */
    public int daysBetween(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    // Cet method get_value nous permet de calculer l'angle de déclinaison
    public double get_value() {

        // declination Angle entre -23.44 in december and 23.44 in june
        return (-23.44 * Math.cos(((double) (360) / (double) (365) * (numberOfDays + 9)) * Math.PI / 180));

    }

    public String print_value() {
        return "L'angle de declinaison (delta) du soleil est : " + get_value()
                + "\n********************************************";
    }
}
