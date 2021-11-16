/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.DAO;

import br.com.DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author viniberaldo
 */
public class LivroDAO {
    
    Connection con;
    PreparedStatement pstm;
    
    public void CadastrarLivro(LivroDTO objLivroDTO) throws ClassNotFoundException {
        String sql = "insert into livro (nome_livro) values (?)";
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_livro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
        }
    }
    
}
