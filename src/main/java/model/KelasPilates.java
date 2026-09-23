package model;

public class KelasPilates {

    private int idKelas;
    private int idMember;
    private int idInstruktur;
    private int idJenis;
    private String tanggal;
    private String waktu;
    private String status;

    public KelasPilates(int idKelas, int idMember,
                        int idInstruktur, int idJenis,
                        String tanggal, String waktu, String status) {

        this.idKelas = idKelas;
        this.idMember = idMember;
        this.idInstruktur = idInstruktur;
        this.idJenis = idJenis;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.status = status;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public int getIdMember() {
        return idMember;
    }

    public int getIdInstruktur() {
        return idInstruktur;
    }

    public int getIdJenis() {
        return idJenis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getStatus() {
        return status;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public void setIdInstruktur(int idInstruktur) {
        this.idInstruktur = idInstruktur;
    }

    public void setIdJenis(int idJenis) {
        this.idJenis = idJenis;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    
}