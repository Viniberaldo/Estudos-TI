<%-- 
    Document   : frmEditarLivroVIEW
    Created on : Nov 16, 2021, 3:25:51 PM
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
        <form action="editarLivro.jsp" method="POST">
            
            <label>Código do Livro: </label> <br>
            <input type="text" name="id" 
                   value="<%=request.getParameter("id")%>"> 
            <br>
            <label>Nome do Livro: </label> <br>
            <input type="text" name="nome" 
                   value="<%=request.getParameter("nome")%>"> 
            
            <button type="submit"> ALTERAR</button>   
        </form>
    </body>
</html>
