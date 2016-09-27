package Server;

import Server.DBconnection.Conexion;
import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mauricio
 */
public class ChatTecServ 
    extends UnicastRemoteObject 
    implements Messaging, LoginInt {

  private static Messaging messagingStub;
  private static LoginInt loginStub;
  
  public ChatTecServ()
      throws RemoteException{}

  /**
   * @param args the command line arguments
   * @throws java.rmi.RemoteException
   * @throws java.rmi.AlreadyBoundException
   * @throws java.net.MalformedURLException
   */
  public static void main(String[] args)
      throws RemoteException, AlreadyBoundException, MalformedURLException {

    ChatTecServ servidor = new ChatTecServ();
    Naming.rebind("ServidorChat", servidor);
    System.out.println("El servidor está corriendo...");
    
  }

  @Override
  public void send(String msg) {
    throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void printMsg() {
    throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Usuario userConnect() {
    throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void userDisconect() {
    throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public int login(Usuario user) throws RemoteException {
    int success = 0;
    Connection con = null;
    try {
      PreparedStatement ps;
      ResultSet rs;
      con = Conexion.getConnection();
      if (con != null) {
        String selectSQL = "SELECT nombre, password, tipo FROM "
            + "usuario WHERE nombre = ?";

        ps = con.prepareStatement(selectSQL);
        ps.setString(1, user.getNombre());
        rs = ps.executeQuery();
        if (rs.next()) {
          user.setContraseña(parsePass(user.getContraseña()));
          String password = rs.getString("password");
          if (password.equals(user.getContraseña())) {
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

  @Override
  public String parsePass(String pass)
      throws NoSuchAlgorithmException, UnsupportedEncodingException,
      RemoteException {
    MessageDigest md;
    md = MessageDigest.getInstance("SHA-256");
    md.update(pass.getBytes("UTF-8"));
    byte[] dPass = md.digest();
    BigInteger bigInt = new BigInteger(1, dPass);
    String hashTxt = bigInt.toString(16);
    return hashTxt;
  }

}
