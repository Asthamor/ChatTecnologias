/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattecnologias;

import Server.LoginInt;
import Server.Messaging;
import chattecnologias.GUI.LoginGUI;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.MalformedURLException;

/**
 *
 * @author mauricio
 */
public class ChatTecnologias {
  public static LoginInt loginStub;
  public static Messaging messagingStub;

  /**
   * @param args the command line arguments
   * @throws java.rmi.RemoteException
   * @throws java.rmi.NotBoundException
   * @throws java.net.MalformedURLException
   */
  public static void main(String[] args) 
      throws RemoteException, NotBoundException, MalformedURLException {
    
    String host = (args.length < 1) ? null : args[0];
    Registry registro = LocateRegistry.getRegistry(host);
    loginStub = (LoginInt) registro.lookup("ServidorChat");
    
   
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginGUI().setVisible(true);
      }
    });
  }
    // TODO code application logic here
  }
