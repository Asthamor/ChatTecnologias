/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.DBconnection;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mauricio, vivie
 */
public class SQLMethods {

  /**
   * Confirma que el usuario exista y tenga privilegios de bibliotecario
   *
   * @param user Datos de login del usuario
   * @param pass Contraseña ingresada
   * @return = 1 si el usuario existe y tiene privilegios = 0 si el usuario no
   * existe = 2 si el usuario existe pero no tiene privilegios = -1 si ocurrió
   * un error de conexión
   */
  public static int validarIngreso(String user, String pass) {
    int success = 0;
    Connection con = null;
    try {
      PreparedStatement ps;
      ResultSet rs;

      con = Conexion.getConnection();
      if (con != null) {
        String selectSQL = "SELECT ID, password, tipo FROM "
            + "usuario WHERE ID = ?";

        ps = con.prepareStatement(selectSQL);
        ps.setString(1, user);
        rs = ps.executeQuery();
        if (rs.next()) {
          pass = parsePass(pass);
          String password = rs.getString("password");
          if (password.equals(pass)) {
            success = 1;
          }
        } else {
          success = 0;
        }
      }
    } catch (SQLException sqx) {
      JOptionPane.showMessageDialog(null,
          "No se pudo conectar a la base de datos.",
          "Error.",
          JOptionPane.ERROR_MESSAGE);
      sqx.printStackTrace();
    } catch (ClassNotFoundException | HeadlessException |
        NoSuchAlgorithmException | UnsupportedEncodingException ex) {
      System.out.println(ex);
    } finally {
      Conexion.cerrarConexion(con);
    }
    return success;
  }

  private static String parsePass(String pass)
      throws NoSuchAlgorithmException, UnsupportedEncodingException {
    MessageDigest md;
    md = MessageDigest.getInstance("SHA-256");
    md.update(pass.getBytes("UTF-8"));
    byte[] dPass = md.digest();
    BigInteger bigInt = new BigInteger(1, dPass);
    String hashTxt = bigInt.toString(16);
    return hashTxt;
  }

}
