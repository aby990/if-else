import java.util.Scanner;

public class TestSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = in.nextLine();
        System.out.print("ID: ");
        int id = in.nextInt();
        System.out.print("IPK: ");
        double ipk = in.nextDouble();

       //membuat obyek
       Siswa adi = new Siswa();
       Siswa lia = new Siswa();

       Siswa ria = new Siswa(10, "Ria", 50);
       Siswa cahya = new Siswa(id,nama,ipk);
       adi.setId(100);
       adi.setNama("Adi");
       adi.setIpk(4);
       System.out.println("Ini Data Adi");
       adi.print();
       System.out.println("Ini Data Lia");
       lia.print();

       ria.print();
       cahya.print();
       System.out.println(ria.print2());

       Siswa ari = new Siswa(id, nama, ipk);

       if (ari.getIpk() >= 75) {
        System.out.println(ari.getNama
        () + "Lulus");
       } else  { 
        System.out.println(ari.getNama() + "Tidak lulus");
       }

       //Nilai huruf
       if (ari.getIpk() < 60 ) {
        System.out.println(" E ");
        
       } else if (ari.getIpk() >60 && ari.getIpk() <=70) {
        System.out.println(" D ");
       } else if (ari.getIpk() >70 && ari.getIpk() <=80) {
        System.out.println(" C ");
       } else if (ari.getIpk() >80 && ari.getIpk() <=90) {
        System.out.println("B");
       } else if (ari.getIpk() >90 && ari.getIpk() <=100) {
        System.out.println("A");
       }
       
       
       in.close();
    }
}