/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_de_aula;

/**
 *
 * @author camar
 */
public class Pieza_Automotriz {
    private int id;
    private String nombre;
    private int cantidad;
    private String ubicacion;
    private String estado;
    
    public Pieza_Automotriz() {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

      public int getid() {
        return id;
    }
      public String getnombre() {
        return nombre;
    }
      public int getcantidad() {
        return cantidad;
    }
      public String getubicacion() {
        return ubicacion;
    }
      public String getestado() {
        return estado;
    }
    
  
      public void setid(int id){
        this.id = id;
    }
       public void setnombre(String nombre){
        this.nombre = nombre;
    }
        public void setcantidad (int cantidad){
        this.cantidad = cantidad;
    }
    public void setubicacion (String ubicacion){
      this.ubicacion = ubicacion;
  }
  public void setestado (String estado){
    this.estado = estado;
  } 
  public Pieza_Automotriz actualizarCantidad(int valor) {
    return new Pieza_Automotriz();
 }
}
