/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.CiclistaDAO;
import DTO.CiclistaDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author viniberaldo
 */
public class frmPrincipalVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipalVIEW
     */
    public frmPrincipalVIEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCiclista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtG_Ciclista = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCiclista = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnCarregarDados = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ciclista");

        jLabel2.setText("Grupo do ciclista");

        txtG_Ciclista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtG_CiclistaActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tabelaCiclista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Ciclista", "Grupo"
            }
        ));
        jScrollPane1.setViewportView(tabelaCiclista);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("Código");

        txtCodigo.setText(" ");
        txtCodigo.setEnabled(false);

        btnCarregarDados.setText("Carregar dados");
        btnCarregarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarDadosActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar dados");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCarregarDados)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(txtCiclista, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(txtG_Ciclista))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCiclista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtG_Ciclista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarDados)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtG_CiclistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtG_CiclistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtG_CiclistaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarCiclista();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        listarValoresCiclista();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCarregarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarDadosActionPerformed
        // TODO add your handling code here:
        try {
            carregarCampos();
        } catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(null, "Clique em Pesquisar para carregar os dados e depois escolha a linha para carregar");
        }
        
        
    }//GEN-LAST:event_btnCarregarDadosActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            editarDados();
            listarValoresCiclista(); 
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Campo vazio");
        }
        


    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregarDados;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCiclista;
    private javax.swing.JTextField txtCiclista;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtG_Ciclista;
    // End of variables declaration//GEN-END:variables

    private void listarValoresCiclista() {
        CiclistaDAO objciclistadao = new CiclistaDAO();
        DefaultTableModel model = (DefaultTableModel) tabelaCiclista.getModel();
        model.setNumRows(0);
        ArrayList<CiclistaDTO> lista = objciclistadao.PesquisarCiclista();
        for (int num = 0; num < lista.size(); num++) {
            model.addRow(new Object[]{
                lista.get(num).getId_usuario(),
                lista.get(num).getNome_ciclista(),
                lista.get(num).getNome_g_ciclista()
            });
            
        }

    }

    private void carregarCampos() {
        int sel = tabelaCiclista.getSelectedRow();

        txtCodigo.setText(tabelaCiclista.getModel().getValueAt(sel, 0).toString());
        txtCiclista.setText(tabelaCiclista.getModel().getValueAt(sel, 1).toString());
        txtG_Ciclista.setText(tabelaCiclista.getModel().getValueAt(sel, 2).toString());
    }

    private void cadastrarCiclista() {
        String ciclista, g_ciclista;
        ciclista = txtCiclista.getText();
        g_ciclista = txtG_Ciclista.getText();

        CiclistaDTO objciclistadto = new CiclistaDTO();
        objciclistadto.setNome_ciclista(ciclista);
        objciclistadto.setNome_g_ciclista(g_ciclista);

        CiclistaDAO objciclistadao = new CiclistaDAO();
        objciclistadao.cadastrarCiclista(objciclistadto);
    }

    private void limparCampos() {
        txtCodigo.setText("");
        txtCiclista.setText("");
        txtG_Ciclista.setText("");
        txtCiclista.requestFocus();
    }

    private void editarDados() {
        int id_usuario;
        String nome_ciclista, nome_g_ciclista;

        id_usuario = Integer.parseInt(txtCodigo.getText());
        nome_ciclista = txtCiclista.getText();
        nome_g_ciclista = txtG_Ciclista.getText();

        CiclistaDTO objciclistadto = new CiclistaDTO();
        objciclistadto.setId_usuario(id_usuario);
        objciclistadto.setNome_ciclista(nome_ciclista);
        objciclistadto.setNome_g_ciclista(nome_g_ciclista);

        CiclistaDAO objciclistadao = new CiclistaDAO();
        objciclistadao.editarCiclista(objciclistadto);
        

    }

}
