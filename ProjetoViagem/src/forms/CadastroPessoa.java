package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Listagem.ListarPessoas;
import classes.Pessoa;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtDataNasc;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoa frame = new CadastroPessoa();
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
	public CadastroPessoa() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformaesPessoais = new JLabel("INFORMAÇÕES PESSOAIS");
		lblInformaesPessoais.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblInformaesPessoais.setBounds(23, 11, 174, 14);
		contentPane.add(lblInformaesPessoais);
		
		JButton btnCadastrarPessoa = new JButton("Cadastrar");
		btnCadastrarPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pessoa pessoa = new Pessoa(txtNome.getText(), txtCpf.getText(), txtDataNasc.getText());
				System.out.println(pessoa.getNome());
				DetalhesViagem dv = new DetalhesViagem();
				dv.setPessoa(pessoa);
				dv.setVisible(true);
					
				
			}
		});
		btnCadastrarPessoa.setBounds(304, 227, 99, 23);
		contentPane.add(btnCadastrarPessoa);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(46, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(46, 97, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Nascimento:");
		lblNewLabel_2.setBounds(46, 138, 132, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNome = new JTextField();
		txtNome.setBounds(203, 44, 200, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(203, 94, 200, 20);
		contentPane.add(txtCpf);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setColumns(10);
		txtDataNasc.setBounds(203, 135, 200, 20);
		contentPane.add(txtDataNasc);
	}
}
