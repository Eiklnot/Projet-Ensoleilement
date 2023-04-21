public class TimeCorrectionFactor {

    private double longitude;
    private EquationOfTime equationOfTime;
    private int universalTimeCoordinate;

    public TimeCorrectionFactor(EquationOfTime equationOfTime, double longitude,
            int universalTimeCoordinate) {
        this.longitude = longitude;
        this.universalTimeCoordinate = universalTimeCoordinate;
        this.equationOfTime = equationOfTime;

    }

    public double get_value() {
        return 4 * (longitude - 15 * universalTimeCoordinate) + equationOfTime.get_value();
    }
}
