package manager;

import database.Koneksi;
import Entitas.Tamu;
import Entitas.Kamar;
import Entitas.Reservasi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SistemReservasi {

    private List<Tamu> listTamu = new ArrayList<>();
    private List<Kamar> listKamar = new ArrayList<>();
    private List<Reservasi> listReservasi = new ArrayList<>();

    //-----------------------------------------------
    // Load Data Tamu dari Database (CRUD - Read)
    //-----------------------------------------------
    public void loadTamu() {
        listTamu.clear();

        try {
            //Koneksi database
            Connection conn = Koneksi.getConnection();

            String sql = "SELECT * FROM tamu";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Filter user dari table tamu
                listTamu.add(new Tamu(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("no_hp"),
                        rs.getString("email"),
                        rs.getString("no_identitas")
                ));
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
