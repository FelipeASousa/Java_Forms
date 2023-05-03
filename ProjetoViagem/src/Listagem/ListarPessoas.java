package Listagem;

import java.util.LinkedList;
import java.util.List;

import classes.Pessoa;

public class ListarPessoas extends Pessoa{
	
	private List<Pessoa> pessoas;
	
	public void setPessoas(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	
}
