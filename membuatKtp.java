
package tugasguru;

import java.util.Scanner;
public class membuatKtp {


    public static void main(String[] args) {
        String nama, TempatLahir, JenisKelamin, GolDarah, Alrt, Alrw, AlDesa, Alkec, Agama, Perkawinan, Pekerjaan, Kewarganegaraan;
        String taggal, bulan, tahun;
        
        Scanner input = new Scanner(System.in);
        System.out.println("===== Mengisi KTP =====");
        System.out.println("masukan data diri ktp anda");
        System.out.println("masukan nama lengkap anda");
        nama = input.nextLine();
        System.out.println("masukan tempat lahir anda");
        TempatLahir = input.nextLine();
        System.out.println("masukan tanggal lahir");
        taggal = input.nextLine();
        System.out.println("masukan bulan lahir anda");
        bulan = input.nextLine();
        System.out.println("masukan tahun lahir anda");
        tahun = input.nextLine();
        System.out.println("masukan jenis kelamin anda");
        JenisKelamin = input.nextLine();
        System.out.println("masukan golongan darah anda jika tidak ada masuka -");
        GolDarah = input.nextLine();
        System.out.println("masukan alamat rt anda");
        Alrt = input.nextLine();
        System.out.println("masukan alamat rw anda");
        Alrw = input.nextLine();
        System.out.println("masukan alamat desa anda");
        AlDesa = input.nextLine();
        System.out.println("masukan alamat kecamatan anda");
        Alkec = input.nextLine();
        System.out.println("masukan agama anda");
        Agama = input.nextLine();
        System.out.println("masukan status perkawinan anda");
        Perkawinan = input.nextLine();
        System.out.println("masukan pekerjaan anda");
        Pekerjaan = input.nextLine();
        System.out.println("masukan kewarga negaraan anda");
        Kewarganegaraan = input.nextLine();
        
        System.out.println("===== KTP Anda =====");
        System.out.println("nama : "+nama);
        System.out.println("tempat/tanggal lahir : "+TempatLahir+", "+taggal+"-"+bulan+"-"+tahun);
        System.out.print("jenis kelamin : "+JenisKelamin+"         ");
        System.out.println("golongan darah : "+GolDarah);
        System.out.println("Alamat : ");
        System.out.println("RT / RW : "+Alrt+" / "+Alrw);
        System.out.println("kelurahan / Desa : "+AlDesa);
        System.out.println("kecamatan : "+Alkec);
        System.out.println("Agama : "+ Agama);
        System.out.println("Status perkawinan : "+Perkawinan);
        System.out.println("Kewarganegaraan : "+Kewarganegaraan);
        
    }
    
}
