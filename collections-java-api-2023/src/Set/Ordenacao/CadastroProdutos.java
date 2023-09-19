package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantdade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantdade));
    }
    
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        System.out.println("Lista de produtos: " + cadastroProdutos.produtoSet);
        
        cadastroProdutos.adicionarProduto("livro", 1, 30.00, 1);
        System.out.println("Lista de produtos: " + cadastroProdutos.produtoSet);
        System.out.println("Organizados por nome: " + cadastroProdutos.exibirProdutosPorNome());
        
        cadastroProdutos.adicionarProduto("livro usado", 1, 30.00, 1);
        cadastroProdutos.adicionarProduto("panela", 2, 100.00, 1);        
        cadastroProdutos.adicionarProduto("comida para gato", 3, 80.00, 1);
        System.out.println("Lista de produtos: " + cadastroProdutos.produtoSet);

        System.out.println("Organizados por nome: " + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Organizados por preço: " + cadastroProdutos.exibirProdutosPorPreco());
        
    }
}
