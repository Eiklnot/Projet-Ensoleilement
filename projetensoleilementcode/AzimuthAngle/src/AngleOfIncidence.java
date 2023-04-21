//class represantant l'energie reçu par une surface

public class AngleOfIncidence {

    private ElevationAngle elevationAngle;
    private AzimuthAngle azimuthAngle;

    public AngleOfIncidence(ElevationAngle elevationAngle, AzimuthAngle azimuthAngle) {
        this.elevationAngle = elevationAngle;
        this.azimuthAngle = azimuthAngle;
    }

    public String get_value() {
        return "acos(sin(p) x cos(" + azimuthAngle.get_value() + " - An) +cos(p) x "
                + Math.sin(elevationAngle.get_value() * Math.PI / 180) + " )";
    }
    
    public String getCosvalue() {
        return "sin(p) x cos(" + azimuthAngle.get_value() + " - An) +cos(p) x "
                + Math.sin(elevationAngle.get_value() * Math.PI / 180);
    }

    public String print_value() {
        return "S'(la pente (p),Angle azimut à la normal (An)) = derivé de l'angle incident (i')xcos(angle incident (i) ) \n"+"********************************************* \n"
                + print_cosval() + "\n"+"********************************************* \n"
                + print_val() + "\n"+"********************************************* \n"
                + "i' = 1/Math.sqrt(1-i^2) \n"+"********************************************* \n"
                + "i' = 1/Math.sqrt(1- (" + get_value() + ")^2) \n"+"********************************************* \n"
                + "S'(p,An) =1/Math.sqrt(1- (" + get_value() + ")^2) x (" + getCosvalue() + ")"+"\n********************************************* \n";
    }

    public String print_val() {
        return "i = acos(sin(p) x cos(alpha) x cos(A-An) + cos(p) x sin(alpha)) \n"+"********************************************* \n"
                + "i = " + get_value();
    }

    public String print_cosval() {
        return "cos(i)=sin(p) x cos(alpha) x cos(A-An) + cos(p) x sin(alpha) \n"+"********************************************* \n"
                + "cos(i) = " + getCosvalue();
    }
}
