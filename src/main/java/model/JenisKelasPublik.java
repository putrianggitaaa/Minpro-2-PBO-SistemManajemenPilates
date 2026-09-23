package model;


public class JenisKelasPublik extends JenisKelas{
     private int kapasitas;

    public JenisKelasPublik(int idJenis, String namaJenis, String level,
                            String durasi, int kapasitas) {
        super(idJenis, namaJenis, level, durasi);
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }
    
    @Override
    public void tampilkanInfo() {
    System.out.println("Nama Kelas : " + getNamaJenis());
    System.out.println("Level      : " + getLevel());
    System.out.println("Durasi     : " + getDurasi());
    System.out.println("Kapasitas : " + kapasitas);
}
}
