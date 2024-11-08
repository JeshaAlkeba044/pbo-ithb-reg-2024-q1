class Toyomba extends Mobil {
    private double BiayaHarian= 4500;
    private boolean banSerep;
    private boolean supir;

    public Toyomba(int lamaSewa, boolean banSerep, boolean supir) {
        super(lamaSewa);
        this.banSerep = banSerep;
        this.supir = supir;
    }

    @Override
    public double hitungBiayaSewa() {
        double biayaSewa = lamaSewa * BiayaHarian;
        if (banSerep) {
            biayaSewa += biayaSewa * 0.03;
        }
        if (supir) {
            biayaSewa += biayaSewa * 0.08;
        }
        if (lamaSewa > 5) {
            biayaSewa -= biayaSewa * 0.07;
        }
        return biayaSewa;
    }

    @Override
    public double nilaiDeposito() {
        return hitungBiayaSewa() * 0.7;
    }
}
