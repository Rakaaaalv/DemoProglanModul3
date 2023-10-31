package Tugas2;

/**
 * Program ini digunakan untuk mengkonversi panjang dari kilometer ke meter dan cm.
 */
public class KonversiPanjang {

    /**
     * Fungsi ini mengkonversi panjang dari kilometer ke meter.
     *
     * @param km Panjang dalam kilometer
     * @return Panjang dalam meter
     */
    public static double kilometerToMeter(double km) {
        return km * 1000;
    }

    /**
     * Fungsi ini mengkonversi panjang dari kilometer ke sentimeter.
     *
     * @param km Panjang dalam kilometer
     * @return Panjang dalam cm
     */
    public static double kilometerToCentimeter(double km) {
        return km * 100000;
    }

    public static void main(String[] args) {
        double panjangKilometer = 5.5;
        double panjangMeter = kilometerToMeter(panjangKilometer);
        double panjangCentimeter = kilometerToCentimeter(panjangKilometer);

        System.out.println(panjangKilometer + " kilometer = " + panjangMeter + " meter");
        System.out.println(panjangKilometer + " kilometer = " + panjangCentimeter + " cm");
    }
}