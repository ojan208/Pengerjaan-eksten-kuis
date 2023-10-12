

public class Ball extends Circle{
    public Ball() {
        super();
    }

    public Ball(int jari) {
        super(jari);
    }

    @Override
    public Float hitungLuas() {
        return 4 * 3.14f * super.getJari() * super.getJari();
    }

    @Override
    public Float hitungLuas(int jari) {
        return 4 * 3.14f * jari * jari;
    }

    public Float hitungVolume() {
        return (4 * 3.14f * super.getJari() * super.getJari() * super.getJari())/3;
    }

    public Float hitungVolume(int jari) {
        return (4 * 3.14f * jari * jari * jari)/3;
    }
    
}
