/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author mauri
 */
public interface Messaging {
  
  public abstract void send(String msg);
  
  public abstract void printMsg();
  
  public abstract Usuario userConnect();
  
  public abstract void userDisconect();
  
}
