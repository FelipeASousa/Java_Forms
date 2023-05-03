package classes;

public class Viagem {
	
	private String destino;
	private Double preco;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Viagem(String destino, Double preco) {
		super();
		this.destino = destino;
		this.preco = preco;
	}
	
	
	public Viagem () {
		
	}
}
