/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.UnsupportedEncodingException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author mauricio
 */
public interface LoginInt extends Remote{
  
  public abstract int login(Usuario user) 
      throws RemoteException;
  
  public abstract String parsePass(String pass) 
      throws NoSuchAlgorithmException, UnsupportedEncodingException, 
      RemoteException;
  
}
