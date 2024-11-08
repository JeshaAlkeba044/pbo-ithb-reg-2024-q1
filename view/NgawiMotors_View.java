class NgawiMotors_View {
    public static void tampilkanReceipt(SewaController controller) {
        Mobil mobil = new Mobil();

        for (int i = 1; i<= controller.paket; i++) {
            System.out.println("Paket " + i + ":\n" + "jenis Kendaraan = " + mobil.getClass().getSimpleName() + "\n Lama hari menyewa = " + mobil.lamaSewa +  
            "hari\n" + "Biaya Sewa = " + mobil.hitungBiayaSewa() + "\n" + "Deposito = " + mobil.hitungDeposito());
            i++;
        }

        System.out.println("\nTotal Biaya Sewa: " + controller.hitungTotalBiaya());
        System.out.println("Total Deposito: " + controller.hitungNilaiDeposito());
    }
}

