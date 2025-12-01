package Entitas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Entitas reservasi yang menghubungkan tamu, kamar, dan tanggal
public class Reservasi {
    private int id;
    private Tamu guest;
    private Kamar room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double totalHarga;
    private String status;

    public Reservasi(int id, Tamu guest, Kamar room, LocalDate in, LocalDate out, String status) {
        this.id = id;
        this.guest = guest;
        this.room = room;
        this.checkIn = in;
        this.checkOut = out;
        this.status = status;
        hitungTotal();
    }

    public long getLamaMenginap() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void hitungTotal() {
        this.totalHarga = getLamaMenginap() * room.getHargaPerMalam();
    }

    public boolean overlaps(LocalDate start, LocalDate end) {
        return (start.isBefore(checkOut) && end.isAfter(checkIn));
    }

    @Override
    public String toString() {
        return "R" + id + " - " + guest.getNama() + " - " + status;
    }
}
