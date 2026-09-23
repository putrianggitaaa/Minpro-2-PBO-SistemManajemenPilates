package model;

public class JenisKelasPrivate extends JenisKelas{
     private String jenisSesi;

    public JenisKelasPrivate(int idJenis, String namaJenis, String level,
                             String durasi, String jenisSesi) {
        super(idJenis, namaJenis, level, durasi);
        this.jenisSesi = jenisSesi;
    }

    public String getJenisSesi() {
        return jenisSesi;
    }
    
    @Override
    public void tampilkanInfo() {
    System.out.println("Nama Kelas : " + getNamaJenis());
    System.out.println("Level      : " + getLevel());
    System.out.println("Durasi     : " + getDurasi());
    System.out.println("Jenis Sesi : " + jenisSesi);
}
}
