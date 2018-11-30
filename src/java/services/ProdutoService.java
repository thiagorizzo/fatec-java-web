/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import models.Produto;

/**
 *
 * @author Rizzo
 */
public class ProdutoService {
    public static ArrayList<Produto> produtos = new ArrayList<Produto>() {{
        add(new Produto() {{ setCodigo(1); setNome("Caneta"); }});
        add(new Produto() {{ setCodigo(2); setNome("Lápis"); }});
        add(new Produto() {{ setCodigo(3); setNome("Régua"); }});
    }};
    
    public ArrayList<Produto> getAll() {
        return produtos;
    }
    
    public void add(Produto produto) {
        produtos.add(produto);
    }
    
    public void remove(Produto produto) {
        produtos.remove(produtos.stream().filter(p -> p.getCodigo() == produto.getCodigo()));
    }    
}
