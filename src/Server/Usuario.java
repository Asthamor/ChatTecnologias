/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author mauricio
 */
public class Usuario {
  private String nombre;
  private String contraseña;

  public Usuario(String nombre, String contraseña) {
    this.nombre = nombre;
    this.contraseña = contraseña;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getContraseña() {
    return contraseña;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }
  
  
  
}
