package list.operacoesBasicas;

import java.security.PermissionCollection;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private final List<item> carrinhoList;

    public CarrinhoDeCompras(){
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new item(nome, preco, quantidade));
    }

    public void removerItem(String nomeRemover){
        List<item> CarrinhoRemover = new ArrayList<>();
        for (item i:carrinhoList){
            if(i.getNome().equalsIgnoreCase(nomeRemover)){
                CarrinhoRemover.add(i);
            }
        }
        carrinhoList.removeAll(CarrinhoRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0d;
        if(!carrinhoList.isEmpty()){
            for (item i : carrinhoList){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println();
    }

}
