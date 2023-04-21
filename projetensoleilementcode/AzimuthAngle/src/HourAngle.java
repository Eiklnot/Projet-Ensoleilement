public class HourAngle {

    private LocalSolarTime localSolarTime;

    public HourAngle(LocalSolarTime localSolarTime) {
        this.localSolarTime = localSolarTime;
    }

    public double get_value() {

        return 15 * (localSolarTime.get_value() - 12);

    }

    public String print_value() {
        return "L'angle horaire (hour) du soleil est : " + get_value()
                + "\n********************************************";
    }
}
