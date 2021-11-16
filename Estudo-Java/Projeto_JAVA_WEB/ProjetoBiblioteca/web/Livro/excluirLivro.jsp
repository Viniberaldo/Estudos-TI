<%-- 
    Document   : excluirLivro
    Created on : Nov 16, 2021, 2:33:19 PM
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
                objLivroDTO.setId_livro(Integer.parseInt(request.getParameter("id")));

                LivroDAO objLivroDAO = new LivroDAO();
                objLivroDAO.ExcluirLivro(objLivroDTO);
            } catch (Exception e) {
            }

        %>
        <a href="http://localhost:8080/ProjetoBiblioteca/Livro/frmLivroVIEW.html">Voltar</a>
    </body>
</html>
