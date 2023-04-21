public class AzimuthAngle {

        private DeclinationAngle declinationAngle;
        private double latitude;
        private ElevationAngle elevationAngle;
        private HourAngle hourAngle;

        // Constructeur de la class azimuth
        public AzimuthAngle(HourAngle hourAngle, ElevationAngle elevationAngle, DeclinationAngle declinationAngle,
                        double latitude) {
                this.declinationAngle = declinationAngle;
                this.latitude = latitude;
                this.elevationAngle = elevationAngle;
                this.hourAngle = hourAngle;
        }

        // cette methode get_value nous calcule l'angle azimuth
        public double get_value() {
                double delta = declinationAngle.get_value();
                double alpha = elevationAngle.get_value();
                double hour1 = hourAngle.get_value();

                if (hour1 >= 0) {

                        return 360 - Math.acos((Math.sin(delta * (Math.PI / 180)) * Math.cos(latitude * (Math.PI / 180))
                                        - Math.cos(delta * (Math.PI / 180)) * Math.sin(latitude * (Math.PI / 180))
                                                        * Math.cos(hour1 * (Math.PI / 180)))
                                        / Math.cos(alpha * (Math.PI / 180))) * 180 / Math.PI;
                } else {
                        return Math.acos((Math.sin(delta * (Math.PI / 180)) * Math.cos(latitude * (Math.PI / 180))
                                        - Math.cos(delta * (Math.PI / 180)) * Math.sin(latitude * (Math.PI / 180))
                                                        * Math.cos(hour1 * (Math.PI / 180)))
                                        / Math.cos(alpha * (Math.PI / 180))) * 180 / Math.PI;
                }
        }

        public String print_value() {
                return "L'angle Azimuth (A) est : " + get_value() + "\n*********************************************";
        }
}
