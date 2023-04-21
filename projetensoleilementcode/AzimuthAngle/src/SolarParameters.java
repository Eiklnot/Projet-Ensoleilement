//fair passer l'ensemble des objets en parametres à la class SolarParameters pour une meilleur representation

public class SolarParameters {

    public B b;
    public EquationOfTime equationOfTime;
    public AzimuthAngle azimuthAngle;
    public ElevationAngle elevationAngle;
    public DeclinationAngle declinationAngle;
    public HourAngle hourAngle;
    public LocalSolarTime localSolarTime;
    public LocalTime localTime;
    public TimeCorrectionFactor timeCorrectionFactor;
    public AngleOfIncidence angleOfIncidence;
    public ShadowReach shadowReach;

    public SolarParameters(int hour, int minute, int jour, int mois, int annee, double latitude, double longitude,
            int universalTimeCoordinate) {
        this.b = new B(hour, minute, jour, mois, annee);
        this.localTime = new LocalTime(hour, minute);
        this.declinationAngle = new DeclinationAngle(jour, mois, annee);
        this.equationOfTime = new EquationOfTime(b);
        this.timeCorrectionFactor = new TimeCorrectionFactor(equationOfTime, longitude, universalTimeCoordinate);
        this.localSolarTime = new LocalSolarTime(localTime, timeCorrectionFactor);
        this.hourAngle = new HourAngle(localSolarTime);
        this.elevationAngle = new ElevationAngle(hourAngle, declinationAngle, latitude);
        this.azimuthAngle = new AzimuthAngle(hourAngle, elevationAngle, declinationAngle, latitude);
        this.angleOfIncidence = new AngleOfIncidence(elevationAngle, azimuthAngle);
        this.shadowReach=new ShadowReach(elevationAngle);
    }

}
