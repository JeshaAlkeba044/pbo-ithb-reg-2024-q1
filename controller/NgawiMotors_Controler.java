import java.util.ArrayList;
import java.util.List;

class NgawiMotors_Controler {
    private List<Mobil> paket = new ArrayList<>();

    public void tambahPaket(Mobil mobil) {
        paket.add(mobil);
    }

    public double hitungTotalBiaya() {
        double totalBiaya = 0;
        totalBiaya += mobil.hitungBiayaSewa();

        return totalBiaya;
    }

    public double hitungNilaiDeposito() {
        double nilaiDeposito = 0;
            nilaiDeposito += mobil.hitungDeposito();
            
        return nilaiDeposito;
    }
}
