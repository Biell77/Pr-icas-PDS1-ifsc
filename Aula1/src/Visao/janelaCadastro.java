package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField texto;
	private JTextField texto2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaCadastro frame = new janelaCadastro();
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
	public janelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Nome do usuário");
		lblTexto.setBounds(107, 13, 80, 14);
		contentPane.add(lblTexto);
		
		texto = new JTextField();
		texto.setBounds(208, 10, 86, 20);
		texto.setText("");
		contentPane.add(texto);
		texto.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = texto.getText();
				String CPF = texto.getText();
				
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido");
				}
				
				if(CPF.isEmpty()) {
					JOptionPane.showMessageDialog(null,  "Nenhum CPF preenchido");
				}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(CPF));
			}
		});
		btnNewButton.setBounds(205, 107, 89, 23);
		contentPane.add(btnNewButton);
		
		texto2 = new JTextField();
		texto2.setBounds(208, 53, 86, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(127, 56, 46, 14);
		contentPane.add(lblNewLabel);
	}
}