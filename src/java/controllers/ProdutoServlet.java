package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Produto;
import services.ProdutoService;

@WebServlet(
        name = "produto",
        description = "Controller de Produtos",
        urlPatterns = "/Produtos",
        initParams = @WebInitParam(name = "titulo", value = "Produtos")
)
public class ProdutoServlet extends HttpServlet {
    ProdutoService produtoService = new ProdutoService();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        ArrayList<Produto> produtos = produtoService.getAll();
        
        PrintWriter out = response.getWriter();
        String titulo = getServletConfig().getInitParameter("titulo");
        out.write("<html><head></head><body><h1>" + titulo + "</h1><hr/>");
                
        for(Produto p : produtos)
        {
            out.write(String.format("<div>%d - %s</div>", p.getCodigo(), p.getNome()));
        }
        
        out.write("</body></html>");
    }
}
