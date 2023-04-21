
public class LocalTime {

    private int hour;
    private int minute;

    public LocalTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

    }

    public double get_value() {
        return ((double) hour) + (((double) minute) / 60);
    }

}
