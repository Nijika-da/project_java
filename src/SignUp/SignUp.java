/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SignUp;

/**
 *
 * @author LENOVO
 */

import java.sql.Connection;

public class SignUp {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
        }
    }
}
