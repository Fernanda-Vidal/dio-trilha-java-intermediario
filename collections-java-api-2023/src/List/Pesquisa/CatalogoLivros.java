package List.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livosPorIntervaloAnos.add(l);
                }
            }
        }
        return livosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "Tolkien", 1954);
        catalogoLivros.adicionarLivro("David Cooperfield", "Charles Dickens", 1850);
        catalogoLivros.adicionarLivro("O Mestre e a Margarida", "Mikhail Bulgakov", 1967);
        catalogoLivros.adicionarLivro("O Rei do Inverno - Crônicas de Arthur", "Bernard Cornwell", 1995);
        catalogoLivros.adicionarLivro("O Rei do Inverno - Crônicas de Arthur", "Bernard Cornwell", 1990);
        catalogoLivros.adicionarLivro("O inimigo de Deus - Crônicas de Arthur", "Bernard Cornwell", 1996);
        catalogoLivros.adicionarLivro("Excalibur - Crônicas de Arthur", "Bernard Cornwell", 1997);

        System.out.println(catalogoLivros.pesquisarPorAutor("Mikhail Bulgakov"));
        
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1950, 1960));

        System.out.println(catalogoLivros.pesquisarPorTitulo("O Rei do Inverno - Crônicas de Arthur"));
    }
}