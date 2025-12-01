package Entitas;

//Entity untuk data kamar hotel
public class Kamar {
    private int id;
    private String nomorKamar;
    private String tipe;
    private double hargaPerMalam;
    private int kapasitas;
    private String status;

    public Kamar(int id, String nomor, String tipe, double harga, int kapasitas, String status) {
        this.id = id;
        this.nomorKamar = nomor;
        this.tipe = tipe;
        this.hargaPerMalam = harga;
        this.kapasitas = kapasitas;
        this.status = status;
    }

    //Method untuk cek ketersediaan kamar
    public boolean isAvailable() {
        return status.equalsIgnoreCase("available");
    }

    //Method untuk set kamar menjadi booked
    public void setBooked() {
        this.status = "booked";
    }

    @Override
    public String toString() {
        return nomorKamar + " - " + tipe;
    }

    long getHargaPerMalam() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

