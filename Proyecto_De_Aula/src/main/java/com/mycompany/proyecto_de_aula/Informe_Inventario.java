/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_de_aula;

/**
 *
 * @author camar
 */
public class Informe_Inventario {
      private int id;
      private String fechaGeneracion;
      private String Contenido;
    
    public Informe_Inventario() {
      this.id = id;
      this.fechaGeneracion = fechaGeneracion;
      this.Contenido = Contenido;

    }
      public int getid() {
        return id;
    }

      public String getfechaGeneracion() {
        return fechaGeneracion;
    }
      public String getContenido() {
        return Contenido;
    }
      public void setid(int id){
        this.id = id;
    }
     
      public void setContenido(String Contenido){
        this.Contenido = Contenido;
    }
       public void setfechaGeneracion(String fechaGeneracion){
        this.fechaGeneracion = fechaGeneracion;
    }

    public Inventario_Automotriz exportarInforme(int valor) {
      return new Inventario_Automotriz();
  }
  public Inventario_Automotriz generarInforme(int valor) {
    return new Inventario_Automotriz();
 }
    public Inventario_Automotriz agregarPieza(int valor) {
    return new Inventario_Automotriz();
    }
}
