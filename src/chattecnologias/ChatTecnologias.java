/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattecnologias;

import Server.LoginInt;
import chattecnologias.GUI.LoginGUI;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author mauricio
 */
public class ChatTecnologias {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
      throws RemoteException, NotBoundException {
    
    String host = (args.length < 1) ? null : args[0];
    //Registry registro = LocateRegistry.getRegistry(host);
    //LoginInt loginstub = (LoginInt) registro.lookup("ServidorLogin");
   
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginGUI().setVisible(true);
      }
    });
  }
    // TODO code application logic here
  }
