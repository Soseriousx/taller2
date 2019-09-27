/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;

/**
 *
 * @author dci
 */
public class Venta {
    private int id;
    private String sucursal;
    private int monto;
    private String fecha;

    public Venta(int id, String sucursal, int monto, String fecha) {
        this.id = id;
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
    }

    public Venta(String sucursal, int monto, String fecha) {
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
