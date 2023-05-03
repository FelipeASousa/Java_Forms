package forms;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Listagem.ListarPessoas;
import classes.Pessoa;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class DetalhesViagem extends JFrame {

	private JPanel contentPane;
	private JTextField txtTeste;
	
	
	private Pessoa pessoa;
	
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetalhesViagem frame = new DetalhesViagem();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DetalhesViagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(29, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtTeste = new JTextField();
		txtTeste.setBounds(180, 38, 86, 20);
		contentPane.add(txtTeste);
		txtTeste.setColumns(10);
	
		txtTeste.setText(pessoa.getNome());
		
	}

}
