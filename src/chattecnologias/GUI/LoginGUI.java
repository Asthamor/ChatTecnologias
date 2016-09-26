/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattecnologias.GUI;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class LoginGUI extends javax.swing.JFrame {

  /**
   * Creates new form Login
   */
  public LoginGUI() {
    initComponents();
  }
  
  private void Ingresar(char pass[]){  
    String password = new String(pass);
   
    switch ()) {
    case 1:
      
      break;
    case 0:
      JOptionPane.showMessageDialog(null,
          "Verifique que sus datos sean correctos",
          "Acceso denegado.",
          JOptionPane.ERROR_MESSAGE);
      lblError.setVisible(true);
      break;
    case 2:
      JOptionPane.showMessageDialog(null,
          "Usuario no autorizado",
          "Acceso denegado.",
          JOptionPane.ERROR_MESSAGE);
      lblError.setVisible(true);
      break;
    default:
      break;
    }
}

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    txtUsuario = new javax.swing.JTextField();
    txtPass = new javax.swing.JPasswordField();
    peekBtn = new javax.swing.JButton();
    btnIngresar = new javax.swing.JButton();
    lblError = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
    txtUsuario.setText("Usuario");
    txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtUsuarioFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtUsuarioFocusLost(evt);
      }
    });
    txtUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtUsuarioActionPerformed(evt);
      }
    });
    txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtUsuarioKeyPressed(evt);
      }
    });

    txtPass.setForeground(new java.awt.Color(102, 102, 102));
    txtPass.setText("Contraseña");
    txtPass.setEchoChar((char) 0);
    txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtPassFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtPassFocusLost(evt);
      }
    });
    txtPass.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPassActionPerformed(evt);
      }
    });
    txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPassKeyPressed(evt);
      }
    });

    peekBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ic_remove_red_eye_black_24dp_1x.png"))); // NOI18N
    peekBtn.setContentAreaFilled(false);
    peekBtn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        peekBtnMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        peekBtnMouseReleased(evt);
      }
    });
    peekBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        peekBtnActionPerformed(evt);
      }
    });

    btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ic_done_black_24dp_1x.png"))); // NOI18N
    btnIngresar.setToolTipText("Ingresar");
    btnIngresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnIngresarActionPerformed(evt);
      }
    });
    btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        btnIngresarKeyReleased(evt);
      }
    });

    lblError.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblError.setForeground(new java.awt.Color(255, 0, 0));
    lblError.setText("Usuario y/o contraseña incorrectos");
    lblError.setVisible(false);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtUsuario)
              .addGroup(layout.createSequentialGroup()
                .addComponent(txtPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peekBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGap(0, 23, Short.MAX_VALUE)
            .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(17, Short.MAX_VALUE)
        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(peekBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    //txtUsuario.requestFocus();
    btnIngresar.requestFocus();

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
    if (txtUsuario.getText().equals("Usuario")) {
      txtUsuario.setText("");
      txtUsuario.setForeground(Color.black);
    }
  }//GEN-LAST:event_txtUsuarioFocusGained

  private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
    if (txtUsuario.getText().equals("")) {
      txtUsuario.setText("Usuario");
      txtUsuario.setForeground(Color.gray);
    }
  }//GEN-LAST:event_txtUsuarioFocusLost

  private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtUsuarioActionPerformed

  private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btnIngresar.doClick();
  }//GEN-LAST:event_txtUsuarioKeyPressed

  private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
    char c[] = txtPass.getPassword();
    String s = new String(c);

    if (s.equals("Contraseña")) {
      txtPass.setEchoChar('*');
      txtPass.setText("");
      txtPass.setForeground(Color.black);
    }
  }//GEN-LAST:event_txtPassFocusGained

  private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
    if (txtPass.getPassword().length == 0) {
      txtPass.setEchoChar((char) 0);
      txtPass.setText("Contraseña");
      txtPass.setForeground(Color.gray);
    }
  }//GEN-LAST:event_txtPassFocusLost

  private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPassActionPerformed

  private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btnIngresar.doClick();
  }//GEN-LAST:event_txtPassKeyPressed

  private void peekBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peekBtnMousePressed
    peekBtn.setIcon(new javax.swing.ImageIcon(getClass()
      .getResource("/ic_remove_red_eye_gray_24dp_1x.png")));
  if (txtPass.getForeground() != Color.gray) {
    txtPass.setEchoChar((char) 0);
    }
  }//GEN-LAST:event_peekBtnMousePressed

  private void peekBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peekBtnMouseReleased
    peekBtn.setIcon(new javax.swing.ImageIcon(getClass()
      .getResource("/ic_remove_red_eye_black_24dp_1x.png")));
  if (txtPass.getForeground() != Color.gray) {
    txtPass.setEchoChar('*');
    }
  }//GEN-LAST:event_peekBtnMouseReleased

  private void peekBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peekBtnActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_peekBtnActionPerformed

  private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    Ingresar(txtPass.getPassword());
  }//GEN-LAST:event_btnIngresarActionPerformed

  private void btnIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_btnIngresarKeyReleased

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginGUI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnIngresar;
  private javax.swing.JLabel lblError;
  private javax.swing.JButton peekBtn;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtUsuario;
  // End of variables declaration//GEN-END:variables
}
