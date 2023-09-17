package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conjuntoPalavras == null) ? 0 : conjuntoPalavras.hashCode());
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
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (conjuntoPalavras == null) {
            if (other.conjuntoPalavras != null)
                return false;
        } else if (!conjuntoPalavras.equals(other.conjuntoPalavras))
            return false;
        return true;
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }
    
    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;

        for(String p : conjuntoPalavras) {
            if(p == palavra) {
                palavraParaRemover = p;
                break;
            }
        }
        conjuntoPalavras.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavras.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Casa");
        conjuntoPalavrasUnicas.adicionarPalavra("Casa");
        
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        
        conjuntoPalavrasUnicas.adicionarPalavra("Geladeira");
        conjuntoPalavrasUnicas.adicionarPalavra("Figurinha");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A palavra informada existe no Set? " + conjuntoPalavrasUnicas.verificarPalavra("Teclado"));
        System.out.println("A palavra informada existe no Set? " + conjuntoPalavrasUnicas.verificarPalavra("casa"));
        System.out.println("A palavra informada existe no Set? " + conjuntoPalavrasUnicas.verificarPalavra("Casa"));

        conjuntoPalavrasUnicas.removerPalavra("Figurinha");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
