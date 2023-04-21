import java.util.Scanner;

public class Exec {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int hour;
            int minute;
            int jour;
            int mois;
            int annee;
            double latitude;
            double longitude;
            int universalTimeCoordinate;

            System.out.println("Entrez l'heure");
            hour = scanner.nextInt();
            System.out.println("Entrez les minutes");
            minute = scanner.nextInt();
            System.out.println("Entrez le jour");
            jour = scanner.nextInt();
            System.out.println("Entrez le mois");
            mois = scanner.nextInt();
            System.out.println("Entrez l'année");
            annee = scanner.nextInt();
            System.out.println("Entrez la latitude");
            latitude = scanner.nextDouble();
            System.out.println("Entrez la longitude");
            longitude = scanner.nextDouble();
            System.out.println("Entrez le UTC");
            universalTimeCoordinate = scanner.nextInt();


            SolarParameters solarParameters = new SolarParameters(hour, minute, jour, mois, annee, latitude, longitude,
                    universalTimeCoordinate);

            System.out.println(solarParameters.azimuthAngle.print_value() + "\n"
                    + solarParameters.elevationAngle.print_value() + "\n"
                    + solarParameters.shadowReach.print_value() + "\n"
                    + solarParameters.angleOfIncidence.print_value());


        }
    }
}
