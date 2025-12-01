package Entitas;

//Entity utama untuk data tamu
public class Tamu {
    private int id;
    private String nama;
    private String noHp;
    private String email;
    private String noIdentitas;

    //Constructor
    public Tamu(int id, String nama, String noHp, String email, String noIdentitas) {
        this.id = id;
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;
        this.noIdentitas = noIdentitas;
    }

    //Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNoHp() { return noHp; }
    public void setNoHp(String noHp) { this.noHp = noHp; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNoIdentitas() { return noIdentitas; }
    public void setNoIdentitas(String noIdentitas) { this.noIdentitas = noIdentitas; }

    @Override
    public String toString() {
        return id + " - " + nama;
    }
}

