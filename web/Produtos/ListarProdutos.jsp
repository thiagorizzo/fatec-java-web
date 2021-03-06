<%-- 
    Document   : ListarProdutos
    Created on : 29/11/2018, 23:06:37
    Author     : Rizzo
--%>

<%@page import="domain.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Produtos</title>
    </head>
    <body>
        <h1>Produtos</h1>
        <hr/>
        <table>
        <%
            List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
            for(Produto p : produtos) 
            {%>
                <tr>
                    <td><%=p.getCodigo()%></td>
                    <td><%=p.getNome()%></td>
                </tr>
            <%}            
        %>
        </table>
    </body>
</html>
