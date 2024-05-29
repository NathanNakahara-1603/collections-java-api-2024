package list.operacoesBasicas;

public class item {
    
    private String nome;
    private Double preco;
    private int quantidade;

    public item(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override
	public String toString() {
		return "Item{" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quant=" + quantidade +
				'}';
    }

}