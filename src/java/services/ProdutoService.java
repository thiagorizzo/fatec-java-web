/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controllers.interfaces.IProdutoService;
import domain.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import repository.ProdutoRepository;
import services.interfaces.IProdutoRepository;

/**
 *
 * @author Rizzo
 */
public class ProdutoService implements IProdutoService {
    
    // TODO: injetar dependência
    IProdutoRepository produtoRepository = new ProdutoRepository();
    
    public static List<Produto> produtos = new ArrayList<Produto>() {{
        add(new Produto() {{ setCodigo(1); setNome("Caneta"); }});
        add(new Produto() {{ setCodigo(2); setNome("Lápis"); }});
        add(new Produto() {{ setCodigo(3); setNome("Régua"); }});
    }};

    @Override    
    public List<Produto> getAll() {
        return produtoRepository.getAll();
    }
    
    @Override
    public Produto addProduto(Produto produto) {
        return produtoRepository.addProduto(produto);
    }

    @Override
    public void removeProduto(Produto produto) {
        produtoRepository.removeProduto(produto);
    }

    @Override
    public Optional<Produto> getProdutoByCodigo(int codigo) {
        return produtoRepository.getProdutoByCodigo(codigo);
    }
}
