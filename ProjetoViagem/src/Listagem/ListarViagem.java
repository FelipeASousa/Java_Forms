package Listagem;

import java.util.List;

import classes.Viagem;

public class ListarViagem extends Viagem {
	private List<Viagem> viagens;
	
	public ListarViagem(List<Viagem> viagens) {
		this.viagens = viagens;
	}
}
