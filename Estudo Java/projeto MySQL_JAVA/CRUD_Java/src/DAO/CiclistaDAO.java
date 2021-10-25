/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CiclistaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author viniberaldo
 */
public class CiclistaDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarCiclista(CiclistaDTO objciclistadto) {
        String sql = "insert into ciclista (nome_ciclista,grupo_ciclista) values (?,?)";

        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objciclistadto.getNome_ciclista());
            pstm.setString(2, objciclistadto.getNome_g_ciclista());
            pstm.execute();
            pstm.close();
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Funcionário DAO" + erro);
        }

    }

}
