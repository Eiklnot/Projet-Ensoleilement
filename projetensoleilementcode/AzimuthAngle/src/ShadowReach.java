//Class represantant la porté de l'ombre

public class ShadowReach {

    private ElevationAngle elevationAngle;

    public ShadowReach(ElevationAngle elevationAngle) {
        this.elevationAngle = elevationAngle;
    }

    public String print_value() {
        return "la longueur de l'ombre (L)=la hauteur de l'objet (C) x cotang(l'angle de l'elevation (alpha)) \n"
                + "********************************************* \n"
                + "L=Cx" + 1 / Math.tan(elevationAngle.get_value() * Math.PI / 180)
                + "\n*********************************************";
    }
}
