
package modul7;
public class Modul7 {
    public static void main(String[] args) {
     antrianmodul7 antrian = new antrianmodul7(10);
     antrian.masuk(40);
     antrian.lihat();
     antrian.masuk(33);
     antrian.lihat();
     System.out.println("nilai yang paling depan =" + antrian.peekDepan());
     antrian.lihat();
     antrian.masuk(60);
     antrian.lihat();
     System.out.println("yang diambil dari antrian =" + antrian.keluar());
     antrian.lihat();
     System.out.println("yang diambil dari antrian =" + antrian.keluar());
     antrian.lihat();
     antrian.masuk(54);
     antrian.lihat();
     System.out.println("nilai yang paling depan =" + antrian.peekDepan());
 }       
}
