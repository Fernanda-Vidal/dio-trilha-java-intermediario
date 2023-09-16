import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List <Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itensList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }

        itensList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item i : itensList) {
            total += i.getPreco();
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(itensList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.err.println("O valor total do seu carrinho de compras é: " + carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.adicionarItem("O Senhor dos Anéis", 31.70, 1);
        carrinhoDeCompras.adicionarItem("Hidratante Facial Cerave", 75.20, 1);
        carrinhoDeCompras.adicionarItem("Protetor Solar Minesol Neostrata 30", 44.50, 1);
        
        System.err.println("O valor total do seu carrinho de compras é: " + carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.adicionarItem("Capinha de celular - Xiaomi", 50.70, 1);
        
        System.err.println("O valor total do seu carrinho de compras é: " + carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.removerItem("Hidratante Facial Cerave");
        
        System.err.println("O valor total do seu carrinho de compras é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }
}
