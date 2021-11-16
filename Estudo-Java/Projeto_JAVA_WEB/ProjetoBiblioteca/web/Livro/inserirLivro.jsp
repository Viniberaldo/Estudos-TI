<%-- 
    Document   : inserirLivro
    Created on : Nov 15, 2021, 4:20:25 PM
    Author     : viniberaldo
--%>

<%@page import="br.com.DAO.LivroDAO"%>
<%@page import="br.com.DTO.LivroDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try {
                LivroDTO objLivroDTO = new LivroDTO();
                objLivroDTO.setNome_livro(request.getParameter("nome"));

                LivroDAO objLivroDAO = new LivroDAO();
                objLivroDAO.CadastrarLivro(objLivroDTO);
            } catch (Exception e) {
            }

        %>
<a href="http://localhost:8080/ProjetoBiblioteca/Livro/listarLivro.jsp">Listar livro</a> 
<a href="http://localhost:8080/ProjetoBiblioteca/Livro/frmLivroVIEW.html">Voltar</a>
    </body>
</html>
