/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author mauricio
 */
public class Conexion {

  /**
   * String de conexión a la BD
   */
  public static final String URL = "jdbc:mysql://127.0.0.1:8889/chattec";
  /**
   * Nombre de usuario para la conexión a BD
   */
  public static final String USERNAME = "root";

  /**
   * Contraseña de la BD
   */
  public static final String PASSWORD = "root";

  /**
   * Inicializa la conexión a la base de datos e incluye el driver jdbc
   * @return Conexión a la base de datos
   * @throws SQLException
   * @throws ClassNotFoundException
   */
  public static Connection getConnection() 
      throws SQLException, ClassNotFoundException {
    Connection connection;
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    
      return connection;
  }

  /**
   * Cierra la conexión a la base de datos
   * @param con conexión previamente establecida
   */
  public static void cerrarConexion(Connection con) {
    try {
      con.close();
    } catch (SQLException | NullPointerException e) {
      System.out.println(e.getMessage());
    }
  }
}
