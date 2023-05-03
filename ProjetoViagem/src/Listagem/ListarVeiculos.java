package Listagem;

import java.util.List;

import classes.Veiculo;

public class ListarVeiculos extends Veiculo {
	private List<Veiculo> veiculos;
	
	public ListarVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
