

public class Tube extends Circle {
    private int tinggi;

    public Tube() {
        super();
        tinggi = 0;
    }

    public Tube(int jari, int tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    @Override
    public Float hitungLuas() {
        Float luas = 0f;
        luas += 2 * super.hitungLuas();
        Float keliling = 2 * 3.14f * this.getJari();
        luas += keliling * tinggi;
        return luas;
    }

    @Override
    public Float hitungLuas(int jari) {
        Float luas = 0f;
        luas += 2 * super.hitungLuas(jari);
        Float keliling = 2 * 3.14f * jari;
        luas += keliling * tinggi;
        return luas;
    }

    public Float hitungLuas(int jari, int tinggi) {
        Float luas = 0f;
        luas += 2 * super.hitungLuas(jari);
        Float keliling = 2 * 3.14f * jari;
        luas += keliling * tinggi;
        return luas;
    }

    public Float hitungVolume() {
        return super.hitungLuas() * this.tinggi;
    }

    public Float hitungVolume(int jari, int tinggi) {
        return super.hitungLuas(jari) * tinggi;
    }
    
}
