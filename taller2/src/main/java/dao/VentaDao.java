/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import logica.Conexion;
import logica.Venta;

/**
 *
 * @author dci
 */
public class VentaDao {
    private Conexion con;

    public VentaDao() {
        con = new Conexion();
    }

    public ArrayList<Venta> getVentas() {
        ArrayList<Venta> ventasBD = new ArrayList<>();
        Connection accesoBD = this.con.getConexion();

        try {
            String sql = "SELECT * FROM Cuenta";
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String sucursal = rs.getString("sucursal");
                int monto = rs.getInt("monto");
                String fecha = rs.getString("fecha");
 
                VendedorDao cuentaDao = new VendedorDao();

                ventasBD.add(new Venta(id, sucursal, monto, fecha));
            }

            accesoBD.close();
            return ventasBD;

        } catch (Exception e) {
            System.out.println("Error");
            return null;
        }
    }
    
       
}
