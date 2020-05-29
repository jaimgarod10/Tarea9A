/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea9a.clases;

/**
 *
 * @author jaimg
 */
public class Clientes {
    
  private String DNI;
  private String nombre;
  private String telefono;
  private String direccion;
  private double deuda;

    public Clientes() {
    }

    public Clientes(String DNI, String nombre, String telefono, String direccion, double deuda) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.deuda = deuda;
    }

  public String getDNI() {
    return DNI;
  }
  public void setDNI(String DNI) {
    this.DNI = DNI;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public double getDeuda() {
    return deuda;
  }
  public void setDeuda(double deuda) {
    this.deuda = deuda;
  }

    @Override
    public String toString() {
        return "Clientes{" + "DNI=" + DNI + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", deuda=" + deuda + '}';
    }
    
}
