/**
 * Latihan61
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Bangun Ruang
 */
public class PBO10k10119176Latihan63 {
    public static void main(String[] args) {
        Bola bola = new Bola();
        double bola1 = bola.hitungVolume(7,0);
        System.out.printf("Hasil : V Bola \t\t= %.1f cm%n", bola1 );

        Tabung tabung = new Tabung();
        double tabung1 = tabung.hitungVolume(10, 21);
        System.out.printf("Hasil : V Tabung \t= %.1f cm%n", tabung1);

        Kerucut kerucut = new Kerucut();
        double kerucut1 = kerucut.hitungVolume(14, 9);
        System.out.printf("Hasil : V Kerucut \t= %.1f cm%n", kerucut1);


    }
}
