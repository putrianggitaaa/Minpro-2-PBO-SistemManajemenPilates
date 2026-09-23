package model;

public class Member {

    private int idMember;
    private String namaMember;
    private String noTelepon;
    private int usia;
    private String jenisKelamin;

    public Member(int idMember, String namaMember, String noTelepon, int usia, String jenisKelamin) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.noTelepon = noTelepon;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }
    
    public int getIdMember() {
        return idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public int getUsia() {
        return usia;
    }
    
    public String getJenisKelamin () {
        return jenisKelamin;
    }
}