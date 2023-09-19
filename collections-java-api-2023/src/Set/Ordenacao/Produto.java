package Set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigo;
    private double preco;
    private int quantdade;

    public Produto(String nome, long codigo, double preco, int quantdade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantdade = quantdade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantdade() {
        return quantdade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantdade=" + quantdade + "]";
    }
    
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}