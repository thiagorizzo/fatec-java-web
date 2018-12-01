/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import domain.Produto;
import java.util.ArrayList;
import java.util.Optional;
import services.interfaces.IProdutoRepository;

/**
 *
 * @author Rizzo
 */
public class ProdutoRepository implements IProdutoRepository {

    public static ArrayList<Produto> produtos = new ArrayList<Produto>() {{
        add(new Produto() {{ setCodigo(1); setNome("Caneta"); }});
        add(new Produto() {{ setCodigo(2); setNome("Lápis"); }});
        add(new Produto() {{ setCodigo(3); setNome("Régua"); }});
    }};    
    
    @Override    
    public ArrayList<Produto> getAll() {
        return produtos;
    }
    
    @Override
    public Produto addProduto(Produto produto) {
        produtos.add(produto);
        return produto;
    }

    @Override
    public void removeProduto(Produto produto) {
        produtos.remove(produtos.stream().filter(p -> p.getCodigo() == produto.getCodigo()));
    }

    @Override
    public Optional<Produto> getProdutoByCodigo(int codigo) {
        return produtos.stream().filter(p -> p.getCodigo() == codigo).findFirst();
    }
}
