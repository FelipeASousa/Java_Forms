package classes;

public class Veiculo {
	private String tipo_veiculo;
	private Double preco;
	
	public String getTipo_veiculo() {
		return tipo_veiculo;
	}
	public void setTipo_veiculo(String tipo_veiculo) {
		this.tipo_veiculo = tipo_veiculo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Veiculo(String tipo_veiculo, Double preco) {
		super();
		this.tipo_veiculo = tipo_veiculo;
		this.preco = preco;
	}
	
	public Veiculo() {
	}
	
}
