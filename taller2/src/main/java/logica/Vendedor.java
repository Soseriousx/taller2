/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author dci
 */
public class Vendedor {
    private int id;
    String nombre;
    String apellido;
    String rut;
    ArrayList<Venta> ventas;

    public Vendedor(int id, String nombre, String apellido, String rut) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public Vendedor(String nombre, String apellido, String rut, ArrayList<Venta> ventas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.ventas=ventas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
        
}
