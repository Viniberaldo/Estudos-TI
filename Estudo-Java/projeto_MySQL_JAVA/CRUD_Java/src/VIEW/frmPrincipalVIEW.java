/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.CiclistaDAO;
import DTO.CiclistaDTO;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.String;

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
        listarValoresCiclista();

        restaurarDadosComboBoxTamCam();

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
        btnExcluir = new javax.swing.JButton();
        cbxTamCam = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro ciclistas");

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

        tabelaCiclista.setAutoCreateRowSorter(true);
        tabelaCiclista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Ciclista", "Grupo" , "Tamanho Camiseta"
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

        btnEditar.setText("Alterar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir dados");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        cbxTamCam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel4.setText("Tamanho de camiseta");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(txtCiclista, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(txtG_Ciclista))
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbxTamCam, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCarregarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCarregarDados)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar)
                    .addComponent(txtCiclista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(txtG_Ciclista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxTamCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtG_CiclistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtG_CiclistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtG_CiclistaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarCiclista();
        listarValoresCiclista();
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
            JOptionPane.showMessageDialog(null, "Campo vazio");
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        try {
            excluirDados();
            listarValoresCiclista();
            limparCampos();
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Campo vazio, selecione uma linha para deletar.");
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbxTamCam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
                lista.get(num).getNome_g_ciclista(),
                lista.get(num).getCod_cam()});
        }
       /** for (int i = 0; i < model.getRowCount(); i++) {
            switch (model.getValueAt(i,3)) {
                
                case 1 -> {
                    model.setValueAt("PP", i, 3);
                }
                case 2 -> {
                    model.setValueAt("P", i, 3);
                }
                case 3 -> {
                    model.setValueAt("M", i, 3);
                }
                case 4 -> {
                    model.setValueAt("G", i, 3);
                }
                case 5 -> {
                    model.setValueAt("GG", i, 3);
                }
                case 6 -> {
                    model.setValueAt("GGG", i, 3);
                }
            }
        }*/

    }

    private void carregarCampos() {
        int sel = tabelaCiclista.getSelectedRow();

        txtCodigo.setText(tabelaCiclista.getModel().getValueAt(sel, 0).toString());
        txtCiclista.setText(tabelaCiclista.getModel().getValueAt(sel, 1).toString());
        txtG_Ciclista.setText(tabelaCiclista.getModel().getValueAt(sel, 2).toString());
        cbxTamCam.setSelectedItem(tabelaCiclista.getModel().getValueAt(sel, 3));
    }

    private void cadastrarCiclista() {
        String ciclista, g_ciclista;
        int cod_cam;
        //recebendo dados do formulário
        ciclista = txtCiclista.getText();
        g_ciclista = txtG_Ciclista.getText();
        cod_cam = id_tam_camiseta.get(cbxTamCam.getSelectedIndex() - 1);
        //mandando dados para o pacote de transferência (DTO)
        CiclistaDTO objciclistadto = new CiclistaDTO();
        objciclistadto.setNome_ciclista(ciclista);
        objciclistadto.setNome_g_ciclista(g_ciclista);
        objciclistadto.setCod_cam(cod_cam);

        CiclistaDAO objciclistadao = new CiclistaDAO();
        objciclistadao.cadastrarCiclista(objciclistadto);
    }

    private void limparCampos() {
        txtCodigo.setText("");
        txtCiclista.setText("");
        txtG_Ciclista.setText("");
        cbxTamCam.setSelectedIndex(0);
        txtCiclista.requestFocus();
    }

    private void editarDados() {
        int id_usuario, cod_cam;
        String nome_ciclista, nome_g_ciclista;

        id_usuario = Integer.parseInt(txtCodigo.getText());
        nome_ciclista = txtCiclista.getText();
        nome_g_ciclista = txtG_Ciclista.getText();
        cod_cam = cbxTamCam.getSelectedIndex();

        CiclistaDTO objciclistadto = new CiclistaDTO();
        objciclistadto.setId_usuario(id_usuario);
        objciclistadto.setNome_ciclista(nome_ciclista);
        objciclistadto.setNome_g_ciclista(nome_g_ciclista);
        objciclistadto.setCod_cam(cod_cam);

        CiclistaDAO objciclistadao = new CiclistaDAO();
        objciclistadao.editarCiclista(objciclistadto);

    }

    private void excluirDados() {
        int id_usuario = Integer.parseInt(txtCodigo.getText());

        CiclistaDTO objciclistadto = new CiclistaDTO();
        objciclistadto.setId_usuario(id_usuario);

        CiclistaDAO objciclistadao = new CiclistaDAO();
        objciclistadao.excluirCiclista(objciclistadto);

    }

    Vector<Integer> id_tam_camiseta = new Vector<Integer>();

    public void restaurarDadosComboBoxTamCam() {
        try {
            CiclistaDAO objciclistadao = new CiclistaDAO();
            ResultSet rs = objciclistadao.listarTamCamiseta();

            while (rs.next()) {
                id_tam_camiseta.addElement(rs.getInt(1));
                cbxTamCam.addItem(rs.getString(2));
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Carregar tamanho da camiseta - frm" + erro);
        }

    }

}
