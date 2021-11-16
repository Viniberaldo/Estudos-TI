/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TamCamisetaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author viniberaldo
 */
public class TamCamisetaDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<TamCamisetaDTO> listaCam = new ArrayList<>();
    
    public ArrayList<TamCamisetaDTO> vetorCamisetas() {
        String sql = "select * from camisetas";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            
            while(rs.next()) {
                TamCamisetaDTO objtamcamisetadto = new TamCamisetaDTO();
                objtamcamisetadto.setDesc_cam(rs.getString("desc_tam_camiseta"));
                objtamcamisetadto.setId_cam(rs.getInt("id_tam_camiseta"));
                
                listaCam.add(objtamcamisetadto);
                        
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "TamCamisetaDAO vetor" + erro);
        }
        return listaCam;
    }
}
