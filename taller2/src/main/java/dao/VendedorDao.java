/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import logica.Conexion;
import logica.Vendedor;
import logica.Venta;

/**
 *
 * @author dci
 */
public class VendedorDao {
    private Conexion con;

    public VendedorDao() {
        con = new Conexion();
    }

    public Vendedor getID(int idVendedor) {
        Vendedor v = null;

        String sql = "SELECT * FROM Cuenta WHERE id=" + idVendedor;

        try {
            Connection accesoBD = this.con.getConexion();
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String rut = rs.getString("rut");

     //           v = new Vendedor(nombre,apellido,rut, new ArrayList<Venta>());
                return v;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error");
            return null;
        }
    }
    public void insertVendedor(Vendedor v){  //agrega
        
        Connection accesoBD=con.getConexion();
        
        try{
            String sql="INSERT INTO retail (nombre,apellido,rut,ventas)" 
                        + "VALUES ('');
            
            Statement st=accesoBD.createStatement();
            st.executeUpdate(sql);
            
        }catch(Exception e){
            System.out.println("Error al insertar la cuenta");
            e.printStackTrace();
        }
        
    }
}
