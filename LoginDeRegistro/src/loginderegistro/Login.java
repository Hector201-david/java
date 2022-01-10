package loginderegistro;

import javax.swing.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setSize(649, 510); //Para ponerle el tamaño que uno decee
        this.setLocationRelativeTo(null); // para ponerlo en el sentro de la pantalla

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel2.setText("LOGIN DE REGISTRO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 30, 310, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraceña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 300, 100, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Correo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 210, 70, 20);

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        getContentPane().add(mail);
        mail.setBounds(340, 240, 230, 30);

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 400, 90, 40);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 400, 90, 40);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(340, 330, 230, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("BIENVENIDOS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 20, 170, 70);

        jLabel6.setText("Version: 0.01 Beta");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 450, 120, 16);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(340, 150, 230, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Usuario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 120, 70, 20);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ESPERAMOS QUE SEA DE SU AGRADO");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 140, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginderegistro/Berries - Tom Kijas.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /* Boton Salir*/
        System.exit(0); //Esto se utiliza para salir del programa

    }//GEN-LAST:event_jButton2ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* Boton de Entrar */

        String usuario = "admin";   //usuario
        String correo = "davo@hd.cu";
        String passw = "123";   //contraceña

        int arroba = 0;
        boolean punto = false;

        /* ----------------------------------------------------------------------------------------------------*/
 /* ----------------------------------------------------------------------------------------------------*/
 /*Recorre todo el correo buscando a ver si no hay mas @*/
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@') {
                arroba++;
            }
            /* ----------------------------------------------------------------------------------------------------*/
 /* ----------------------------------------------------------------------------------------------------*/
 /*Recorre todo el correo buscando a ver si no hay mas puntos( . )*/
            if (correo.charAt(i) == '.') {
                punto = true;
            }
            
            if (correo.endsWith(".cu")) {
                System.out.println("Es correcto");
            }else{
                System.out.println("No es correcto");
            }
            
        }
        
       
        /* ----------------------------------------------------------------------------------------------------*/
 /* ----------------------------------------------------------------------------------------------------*/
        if (arroba == 1 && punto == true) {
            System.out.println("EL CORREO ES CORRECTO");
        } else {
            System.out.println("EL CORREO NO ES CORRECTO");
            JOptionPane.showMessageDialog(null, "El Correo No Es Correcto Por Favor Rectifiquelo");  //muestra un mensaje de alerta JOptionPane.showInternalMessageDialog(null, "");

        }
        
        for (int i = 0; i < passw.length(); i++) {
            
        }
        
        /* ----------------------------------------------------------------------------------------------------*/
 /* ----------------------------------------------------------------------------------------------------*/
 /* condicion*/
        if (user.getText().equalsIgnoreCase(usuario) && mail.getText().equals(correo) && pass.getText().equals(passw)) {

            Principal prin = new Principal();  // para mostrar la pagina principal
            prin.setVisible(true);  // si la condicion anterior es verdadera muestra la pangina principal
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
        }
        /* ----------------------------------------------------------------------------------------------------*/
 /* ----------------------------------------------------------------------------------------------------*/

    }//GEN-LAST:event_jButton1ActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        /* Correo */
    }//GEN-LAST:event_mailActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
