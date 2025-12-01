package Entitas;


public class Petugas {

    private int id;
    private String username;
    private String password;
    private String nama;

    public Petugas(int id, String username, String password, String nama) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    // Getter Setters
    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getNama() { return nama; }

    public void setId(int id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setNama(String nama) { this.nama = nama; }

    @Override
    public String toString() {
        return id + " - " + nama;
    }
}

