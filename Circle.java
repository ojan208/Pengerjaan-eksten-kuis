

public class Circle{
    private int jari;

    public Circle() {
        jari = 0;
    }

    public Circle(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public Float hitungLuas() {
        return 3.14f * jari * jari;
    }

    public Float hitungLuas(int jari) {
        return 3.14f * jari * jari;
    }
}