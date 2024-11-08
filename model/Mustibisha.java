class Mustibisha extends Mobil {
    private double BiayaHarian = 3000;
    private boolean banSerep;

    public Mustibisha(int lamaSewa, boolean banSerep) {
        super(lamaSewa);
        this.banSerep = banSerep;
    }

    public boolean isBanSerep() {
        return banSerep;
    }
    public void setBanSerep(boolean banSerep) {
        this.banSerep = banSerep;
    }


    @Override
    public double hitungBiayaSewa() {
        double biayaSewa = lamaSewa * BiayaHarian;
        if (banSerep) {
            biayaSewa += biayaSewa * 0.05;
        }
        return biayaSewa;
    }

    @Override
    public double nilaiDeposito() {
        return hitungBiayaSewa() * 0.7;
    }
}
