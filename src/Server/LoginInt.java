/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author mauricio
 */
public interface LoginInt {
  
  public abstract int Login(String user, String pass) 
      throws RemoteException;
  
  public abstract String parsePass(String pass) 
      throws NoSuchAlgorithmException, UnsupportedEncodingException, 
      RemoteException;
  
}
