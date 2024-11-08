public class Main {
    public static void main(String[] args) {
        NgawiMotors_Controler controller = new NgawiMotors_Controler();

        Mobil mobil_Mustibisah = new Mustibisha(3, true);
        Mobil mobil_Toyomba = new Toyomba(6, false, true);
        Mobil mobil_Lempergember = new Lempergember(4, "profesional", true);

        controller.tambahPaket(mobil1);
        controller.tambahPaket(mobil2);
        controller.tambahPaket(mobil3);
        
        NgawiMotors_View.tampilkanReceipt(controller);
    }
}
