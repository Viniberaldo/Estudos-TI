/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CiclistaDTO;
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
public class CiclistaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CiclistaDTO> lista = new ArrayList<>();
    

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
            JOptionPane.showMessageDialog(null, "Funcionário DAO Cadastrar" + erro);
        }

    }
    
    public ArrayList<CiclistaDTO> PesquisarCiclista(){
        String sql = "select * from ciclista";
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                CiclistaDTO objciclistadto = new CiclistaDTO();
                objciclistadto.setId_usuario(rs.getInt("id_usuario"));
                objciclistadto.setNome_ciclista(rs.getString("nome_ciclista"));
                objciclistadto.setNome_g_ciclista(rs.getString("grupo_ciclista"));
                
                lista.add(objciclistadto);
                
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"CiclistaDAO Pesquisar" + erro);
        }
        
        return lista;
    }
}
