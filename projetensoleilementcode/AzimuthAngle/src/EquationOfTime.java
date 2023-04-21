public class EquationOfTime {
    private B b;

    public EquationOfTime(B b) {
        this.b = b;
    }

    public double get_value() {
        
        return 229.18 * (0.000075 + 0.001868 * Math.cos(b.get_value() )
                - 0.032077 * Math.sin(b.get_value() )
                - 0.014615 * Math.cos(2 * b.get_value() )
                - 0.040849 * Math.sin(2 * b.get_value() ));
    

}
}