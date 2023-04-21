public class ElevationAngle {

    private double latitude;
    private DeclinationAngle declinationAngle;
    private HourAngle hourAngle;

    public ElevationAngle(HourAngle hourAngle, DeclinationAngle declinationAngle, double latitude) {
        this.latitude = latitude;
        this.declinationAngle = declinationAngle;
        this.hourAngle = hourAngle;
    }

    public double get_value() {
        double delta = declinationAngle.get_value();
        double hour1 = hourAngle.get_value();

        return (Math.asin(Math.sin(latitude * Math.PI / 180) * Math.sin(delta * Math.PI / 180)
                + Math.cos(latitude * Math.PI / 180) * Math.cos(delta * Math.PI / 180)
                        * Math.cos(hour1 * Math.PI / 180)))
                * 180 / Math.PI;
    }

    public String print_value() {
        return "L'angle de l'elevation (alpha) du soleil est : " + get_value()
                + "\n*********************************************";
    }
    
}
