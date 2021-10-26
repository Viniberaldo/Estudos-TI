/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CiclistaDTO;
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
public class CiclistaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CiclistaDTO> lista = new ArrayList<>();

    public void cadastrarCiclista(CiclistaDTO objciclistadto) {
        String sql = "insert into ciclista (nome_ciclista,grupo_ciclista, cod_cam) values (?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objciclistadto.getNome_ciclista());
            pstm.setString(2, objciclistadto.getNome_g_ciclista());
            pstm.setInt(3, objciclistadto.getCod_cam());
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionário DAO Cadastrar" + erro);
        }

    }

    public ArrayList<CiclistaDTO> PesquisarCiclista() {
        String sql = "select * from ciclista";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);

            while (rs.next()) {
                CiclistaDTO objciclistadto = new CiclistaDTO();
                objciclistadto.setId_usuario(rs.getInt("id_usuario"));
                objciclistadto.setNome_ciclista(rs.getString("nome_ciclista"));
                objciclistadto.setNome_g_ciclista(rs.getString("grupo_ciclista"));
                //objciclistadto.setDesc_tam_camiseta(rs.getString("desc_tam_camiseta"));

                lista.add(objciclistadto);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CiclistaDAO Pesquisar" + erro);
        }

        return lista;
    }
    
    public void editarCiclista(CiclistaDTO objciclistadto) {
        String sql = "update ciclista set nome_ciclista = ?, grupo_ciclista = ? where id_usuario = ?";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objciclistadto.getNome_ciclista());
            pstm.setString(2, objciclistadto.getNome_g_ciclista());
            pstm.setInt(3, objciclistadto.getId_usuario());
            
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionário DAO Alterar" + erro);
        }
    }
    
    public void excluirCiclista(CiclistaDTO objciclistadto){
        String sql = "delete from ciclista where id_usuario = ?";
        conn = new ConexaoDAO().conectaBD();
        
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objciclistadto.getId_usuario());
            
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CiclistaDAO Excluir" + erro);
        }
        
    }
    
    public ResultSet listarTamCamiseta() throws SQLException{
        conn = new ConexaoDAO().conectaBD();
        String sql = "SELECT * FROM camisetas";
        
        try {
            pstm = conn.prepareStatement(sql);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Listar camiseta - funcionárioDAO" + erro);
        }
       return pstm.executeQuery();         
    }
    
}
