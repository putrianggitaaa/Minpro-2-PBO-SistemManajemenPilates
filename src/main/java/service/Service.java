package Service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Member;
import model.KelasPilates;
import model.JenisKelas;
import model.Instruktur;
import model.JenisKelasPrivate;
import model.JenisKelasPublik;

public class Service {

    private ArrayList<Member> daftarMember;
    private ArrayList<Instruktur> daftarInstruktur;
    private ArrayList<JenisKelas> daftarJenisKelas;
    private ArrayList<KelasPilates> daftarKelas;

    private Scanner scanner;
    private InputValidator validator;


    public Service(Scanner scanner) {

        this.daftarMember = new ArrayList<>();
        this.daftarInstruktur = new ArrayList<>();
        this.daftarJenisKelas = new ArrayList<>();
        this.daftarKelas = new ArrayList<>();

        this.scanner = scanner;
        this.validator = new InputValidator(scanner);

   
        daftarMember.add(new Member(
                1, "Gita", "0852458335528", 20, "Perempuan"
        ));

        daftarInstruktur.add(new Instruktur(
                1, "Davi", "Mat Pilates", "081234567890", "Laki-laki", "Samarinda"
        ));

        daftarJenisKelas.add(new JenisKelas(
                1, "Mat Pilates", "Beginner", "60 Menit"
        ));

        daftarJenisKelas.add(new JenisKelasPrivate(
                2, "Reformer Pilates", "Intermediate", "60 Menit", "Couple Session"
        ));

        daftarJenisKelas.add(new JenisKelasPublik(
                3, "Mat Pilates", "Intermediate", "60 Menit", 15
        ));
        
        daftarKelas.add(new KelasPilates(
                1,1 , 1, 1, "Rabu, 23 September 2026", "19.00 WITA", "Terjadwal" 
        ));
        
    }


    public void tambahMember() {

        int idMember;

        while (true) {
            idMember = validator.inputInteger("ID Member: ");

            boolean sudahAda = false;

            for (Member M : daftarMember) {
                if (M.getIdMember() == idMember) {
                    sudahAda = true;
                    break;
            }
        }

            if (sudahAda) {
                System.out.println(">> ID Member sudah digunakan, masukkan ID baru yaa!");
            } else {
                break;
        }
    }
        String namaMember = validator.inputString("Nama: ");
        String noTelepon = validator.inputNoTelepon("No Telepon: ");
        int usia = validator.inputUsia("Usia: ");
        String jenisKelamin = validator.inputJenisKelamin();

        Member memberBaru = new Member(idMember,namaMember,noTelepon,usia,jenisKelamin);

        daftarMember.add(memberBaru);

        System.out.println(">> Selamat Bergabung, GeetsMates ^'^!");
}
    
    
    public void lihatMember() {

        for (int i = 0; i < daftarMember.size(); i++) {

            Member M = daftarMember.get(i);

            System.out.println("ID Member: " + M.getIdMember());
            System.out.println("Nama Member: " + M.getNamaMember());
            System.out.println("No Telepon: " + M.getNoTelepon());
            System.out.println("Usia: " + M.getUsia());
            System.out.println("Jenis Kelamin: " + M.getJenisKelamin());
            System.out.println("--------------------------------");
        }
    }

    
    public void tambahInstruktur() {
    int idInstruktur;
    while (true) {
        idInstruktur = validator.inputInteger("ID Instruktur: ");

        boolean sudahAda = false;

        for (Instruktur I : daftarInstruktur) {
            if (I.getIdInstruktur() == idInstruktur) {
                sudahAda = true;
                break;
            }
        }

        if (sudahAda) {
            System.out.println(">> ID Instruktur sudah digunakan, masukkan ID baru yaa!");
        } else {
            break;
        }
    }
        String namaInstruktur = validator.inputString("Nama: ");
        String spesialisasi = validator.inputString("Spesialisasi: ");
        String noTelepon = validator.inputNoTelepon("No Telepon: ");
        String jenisKelamin = validator.inputJenisKelamin();
        String domisili = validator.inputString("Domisili: ");

        Instruktur instrukturBaru = new Instruktur(idInstruktur,namaInstruktur,spesialisasi,noTelepon,jenisKelamin,domisili);

        daftarInstruktur.add(instrukturBaru);

        System.out.println(">> Selamat Bergabung, Instruktur GeetsMates! ^'^");
}
    
    
    public void lihatInstruktur() {
        for (int i = 0; i < daftarInstruktur.size(); i++) {

            Instruktur I = daftarInstruktur.get(i);

            System.out.println("ID Instruktur: " + I.getIdInstruktur());
            System.out.println("Nama Instruktur: " + I.getNamaInstruktur());
            System.out.println("Spesialisasi: " + I.getSpesialisasi());
            System.out.println("No Telepon: " + I.getNoTelepon());
            System.out.println("Jenis Kelamin: " + I.getJenisKelamin());
            System.out.println("Domisili: " + I.getDomisili());
            System.out.println("--------------------------------");
        }
    }
    
    
    public void tambahJenisKelas() {
        System.out.println("\n=== TAMBAH JENIS KELAS ===");
        System.out.println("1. Kelas Private");
        System.out.println("2. Kelas Publik");

        int pilihan = validator.inputPilihan("Pilih jenis kelas: ", 1, 2);

        int idJenis;

        while (true) {
            idJenis = validator.inputInteger("ID Jenis: ");

            boolean sudahAda = false;

            for (JenisKelas J : daftarJenisKelas) {
                if (J.getIdJenis() == idJenis) {
                    sudahAda = true;
                    break;
            }
        }

        if (sudahAda) {
            System.out.println(">> ID Jenis Kelas sudah digunakan!");
            } else {
                break;
        }
    }

            String namaJenis = validator.inputString("Nama Pilates: ");
            String level = validator.inputString("Level: ");
            String durasi = validator.inputString("Durasi: ");

            if (pilihan == 1) {

                String jenisSesi = validator.inputString("Jenis Sesi: ");

                JenisKelasPrivate jenisBaru = new JenisKelasPrivate(idJenis,namaJenis,level,durasi,jenisSesi);

            daftarJenisKelas.add(jenisBaru);

        } else {

            int kapasitas = validator.inputKapasitas("Kapasitas: ");

            JenisKelasPublik jenisBaru = new JenisKelasPublik(idJenis,namaJenis,level,durasi,kapasitas);

            daftarJenisKelas.add(jenisBaru);
        }

        System.out.println(">> Kelas Pilates Berhasil Ditambahkan ^,^!");
}
    
    public void lihatJenisKelas() {
        for (JenisKelas J : daftarJenisKelas) {
        System.out.println("ID Jenis: " + J.getIdJenis());
        J.tampilkanInfo();
        System.out.println("--------------------------------");
    }
}
    

    public void lihatPendaftarKelas() {

        for (int i = 0; i < daftarKelas.size(); i++) {
            KelasPilates K = daftarKelas.get(i);
            String namaMember = "";
            String namaInstruktur = "";
            String namaJenis = "";
            
            for (Member M : daftarMember) {
                if (M.getIdMember() == K.getIdMember()) {
                    namaMember = M.getNamaMember();
                    break;
            }
        }


            for (Instruktur I : daftarInstruktur) {
                if (I.getIdInstruktur() == K.getIdInstruktur()) {
                    namaInstruktur = I.getNamaInstruktur();
                    break;
            }
        }


            for (JenisKelas J : daftarJenisKelas) {
                if (J.getIdJenis() == K.getIdJenis()) {
                    namaJenis = J.getNamaJenis();
                    break;
            }
        }

            System.out.println("ID Kelas        : " + K.getIdKelas());
            System.out.println("Nama Member     : " + namaMember);
            System.out.println("Nama Instruktur : " + namaInstruktur);
            System.out.println("Jenis Pilates   : " + namaJenis);
            System.out.println("Tanggal         : " + K.getTanggal());
            System.out.println("Waktu           : " + K.getWaktu());
            System.out.println("Status          : " + K.getStatus());
            System.out.println("--------------------------------");
    }
}
    
 
    public void tambahKelas() {
        System.out.println("\n========================================");
        System.out.println("        Lihat Daftar GeetsMates");
        System.out.println("========================================");
        lihatMember();
        Member memberDipilih = null;

        while (true) {
            int idMember = validator.inputInteger("Pilih ID Member: ");

            memberDipilih = null;

            for (Member M : daftarMember) {
                if (M.getIdMember() == idMember) {
                    memberDipilih = M;
                    break;
            }
        }

            if (memberDipilih != null) {
                break;
        }

            System.out.println(">> ID Member Belum Terdata yaa GeetsMates!");
    }

        System.out.println("\n========================================");
        System.out.println("       Lihat Jenis Kelas GeetsMates");
        System.out.println("========================================");
        lihatJenisKelas();
        
        JenisKelas jenisDipilih = null;

        while (true) {
            int idJenis = validator.inputInteger("Pilih ID Jenis: ");

            jenisDipilih = null;

            for (JenisKelas J : daftarJenisKelas) {
                if (J.getIdJenis() == idJenis) {
                    jenisDipilih = J;
                    break;
            }
        }

            if (jenisDipilih != null) {
                break;
        }

            System.out.println(">> ID Jenis Kelas Belum Terdata yaa, GeetsMates!");
    }

        System.out.println("\n========================================");
        System.out.println("       Lihat Instruktur GeetsMates");
        System.out.println("========================================");
        lihatInstruktur();

        Instruktur instrukturDipilih = null;

        while (true) {
            int idInstruktur = validator.inputInteger("Pilih ID Instruktur: ");

            instrukturDipilih = null;

            for (Instruktur I : daftarInstruktur) {
                if (I.getIdInstruktur() == idInstruktur) {
                    instrukturDipilih = I;
                    break;
            }
            }

            if (instrukturDipilih != null) {
                break;
            }

            System.out.println(">> ID Instruktur Belum Terdata yaa, GeetsMates!"
        );
    }

        int idKelas;

        while (true) {

            idKelas = validator.inputInteger("ID Kelas: ");

            boolean sudahAda = false;

            for (KelasPilates K : daftarKelas) {
                if (K.getIdKelas() == idKelas) {
                    sudahAda = true;
                    break;
            }
            }

            if (sudahAda) {
                System.out.println(">> ID Kelas sudah digunakan, masukkan ID baru yaa!");
        } else {
            break;
        }
    }

        String tanggal = validator.inputString("Tanggal: ");
        String waktu = validator.inputString("Waktu: ");
        String status = validator.inputStatus();

        KelasPilates kelasBaru = new KelasPilates(
        idKelas,
        memberDipilih.getIdMember(),
        instrukturDipilih.getIdInstruktur(),
        jenisDipilih.getIdJenis(),
        tanggal,
        waktu,
        status
    );

        daftarKelas.add(kelasBaru);
        
        System.out.println("\n>> Selamat Mengikuti Kelas, GeetsMates!");
        System.out.println("Member     : " + memberDipilih.getNamaMember());
        System.out.println("Jenis      : " + jenisDipilih.getNamaJenis());
        System.out.println("Instruktur : " + instrukturDipilih.getNamaInstruktur());
        System.out.println("Tanggal    : " + tanggal);
        System.out.println("Waktu      : " + waktu);
        System.out.println("Status     : " + status);
}

    public void hapusDaftarKelas() {

        int idKelas = validator.inputInteger("Masukkan ID Kelas yang Ingin Dihapus: ");

        boolean ditemukan = false;

        for (int i = 0; i < daftarKelas.size(); i++) {

            if (daftarKelas.get(i).getIdKelas() == idKelas) {

                daftarKelas.remove(i);
                ditemukan = true;

                System.out.println(">> Sampai Ketemu Lagi, GeetsMates!");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println(">> ID Kelas tidak ditemukan!");
        }
    }


    public void updateKelas() {

        int idKelas = validator.inputInteger("Masukkan ID Kelas yang Ingin Diupdate: ");

        boolean ditemukan = false;

        for (KelasPilates K : daftarKelas) {

        if (K.getIdKelas() == idKelas) {

            ditemukan = true;

            String status = validator.inputStatus();

            K.setStatus(status);

            System.out.println(">> Status kelas berhasil diperbarui!");
            System.out.println(">> Status Baru: " + status);
            break;
        }
    }

    if (ditemukan) {
        System.out.println( ">> Data kelas berhasil diperbarui!");
    } else {
        System.out.println(">> ID Kelas tidak ditemukan. " +"Silakan masukkan ID Kelas yang benar.");
        }
    }
}