/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.RemoteException;

/**
 *
 * @author mauri
 */
public interface Messaging {
  
  public abstract void send(String msg) throws RemoteException;
  
  public abstract void printMsg() throws RemoteException;
  
  public abstract Usuario userConnect() throws RemoteException;
  
  public abstract void userDisconect() throws RemoteException;
  
}
