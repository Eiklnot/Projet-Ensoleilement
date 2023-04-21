public class LocalSolarTime {
    private LocalTime localTime;
    private TimeCorrectionFactor timeCorrectionFactor;

    public LocalSolarTime(LocalTime localTime, TimeCorrectionFactor timeCorrectionFactor){
        this.localTime= localTime;
        this.timeCorrectionFactor=timeCorrectionFactor;
    }

    public double get_value(){
        return localTime.get_value() + timeCorrectionFactor.get_value()/60;
    }

}
