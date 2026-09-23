package model;

public class Instruktur {

    private int idInstruktur;
    private String namaInstruktur;
    private String spesialisasi;
    private String noTelepon;
    private String jenisKelamin;
    private String domisili;

    public Instruktur(int idInstruktur, String namaInstruktur, String spesialisasi, String noTelepon, String jenisKelamin, String domisili) {
        this.idInstruktur = idInstruktur;
        this.namaInstruktur = namaInstruktur;
        this.spesialisasi = spesialisasi;
        this.noTelepon = noTelepon;
        this.jenisKelamin = jenisKelamin;
        this.domisili = domisili;
    }
    
    public int getIdInstruktur() {
        return idInstruktur;
    }

    public String getNamaInstruktur() {
        return namaInstruktur;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public String getNoTelepon() {
        return noTelepon;
    }
    
    public String getJenisKelamin () {
        return jenisKelamin;
    }
    
    public String getDomisili () {
        return domisili;
    }

}