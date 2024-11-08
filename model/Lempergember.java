class Lempergember extends Mobil {
    private double BiayaHarian = 5000;
    private String supir;
    private boolean antar;

    public Lempergember(int lamaSewa, String supir, boolean antar) {
        super(lamaSewa);
        this.supir = supir;
        this.antar = antar;
    }

    public String getSupir() {
        return supir;
    }
    public void setSupir(String supir) {
        this.supir = supir;
    }

    public boolean isAntar() {
        return antar;
    }
    public void setAntar(boolean antar) {
        this.antar = antar;
    }



    @Override
    public double hitungBiayaSewa() {
        double biayaSewa = lamaSewa * BiayaHarian;
        if (supir.equals("biasa")) {
            biayaSewa += biayaSewa * 0.07;
        } else if (supir.equals("profesional")) {
            biayaSewa += biayaSewa * 0.10;
        }
        if (antar && lamaSewa <= 5) {
            biayaSewa += 300;
        }
        return biayaSewa;
    }

    @Override
    public double nilaiDeposito() {
        return hitungBiayaSewa() * 0.7;
    }
}



