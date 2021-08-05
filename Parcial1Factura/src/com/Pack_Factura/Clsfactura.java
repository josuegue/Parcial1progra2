/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pack_Factura;

/**
 *
 * @author USUARIOTC
 */
public class Clsfactura {
    
    private int cantidad;
    private String descripcion;
    private int precio;
    private double gastoPeso;
    private double gastoValor;
    private double costoUnidad;
    private double totalVenta;
    private int kgProducto;

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the gastoPeso
     */
    public double getGastoPeso() {
        return gastoPeso;
    }

    /**
     * @param gastoPeso the gastoPeso to set
     */
    public void setGastoPeso(double gastoPeso) {
        this.gastoPeso = gastoPeso;
    }

    /**
     * @return the gastoValor
     */
    public double getGastoValor() {
        return gastoValor;
    }

    /**
     * @param gastoValor the gastoValor to set
     */
    public void setGastoValor(double gastoValor) {
        this.gastoValor = gastoValor;
    }

    /**
     * @return the costoUnidad
     */
    public double getCostoUnidad() {
        return costoUnidad;
    }

    /**
     * @param costoUnidad the costoUnidad to set
     */
    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    /**
     * @return the totalVenta
     */
    public double getTotalVenta() {
        return totalVenta;
    }

    /**
     * @param totalVenta the totalVenta to set
     */
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    /**
     * @return the kgProducto
     */
    public int getKgProducto() {
        return kgProducto;
    }

    /**
     * @param kgProducto the kgProducto to set
     */
    public void setKgProducto(int kgProducto) {
        this.kgProducto = kgProducto;
    }
    
}
