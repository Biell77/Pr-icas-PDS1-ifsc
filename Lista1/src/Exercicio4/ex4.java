package Exercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField CampoTexto1;
	private JTextField CampoTexto2;
	private JButton BotaoSubtracao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex4 frame = new ex4();
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
	public ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CampoTexto1 = new JTextField();
		CampoTexto1.setBounds(10, 11, 86, 20);
		contentPane.add(CampoTexto1);
		CampoTexto1.setColumns(10);
		
		CampoTexto2 = new JTextField();
		CampoTexto2.setBounds(125, 11, 86, 20);
		contentPane.add(CampoTexto2);
		CampoTexto2.setColumns(10);
		
		BotaoSubtracao = new JButton("Subtração");
		BotaoSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(CampoTexto1.getText());
				Long inp2 = Long.valueOf(CampoTexto2.getText());
				
				Long sub = inp1 - inp2;
				
				JOptionPane.showMessageDialog(BotaoSubtracao, "A subtração de tudo foi: " + sub);
			}
		});
		BotaoSubtracao.setBounds(122, 42, 89, 23);
		contentPane.add(BotaoSubtracao);
		
		JButton BotaoSoma = new JButton("Soma");
		BotaoSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double inp1 = Double.valueOf(CampoTexto1.getText());
				Double inp2 = Double.valueOf(CampoTexto2.getText());
				
				Double soma = inp1 + inp2;
				
				JOptionPane.showMessageDialog(BotaoSoma, "A soma total é: " + soma);
			}
		});
		BotaoSoma.setBounds(10, 42, 89, 23);
		contentPane.add(BotaoSoma);
		
		JButton BotaoMulti = new JButton("Multiplicação");
		BotaoMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(CampoTexto1.getText());
				Long inp2 = Long.valueOf(CampoTexto2.getText());
				
				Long mult = inp1 * inp2;
				
				JOptionPane.showMessageDialog(BotaoSoma, "A multiplicação total é: " + mult);
			}
		});
		BotaoMulti.setBounds(10, 76, 89, 23);
		contentPane.add(BotaoMulti);
		
		JButton BotaoDivisao = new JButton("Divisão");
		BotaoDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(CampoTexto1.getText());
				Long inp2 = Long.valueOf(CampoTexto2.getText());
				
				Long div = inp1 / inp2;
				
				JOptionPane.showMessageDialog(BotaoSoma, "A divisão total é: " + div);
			}
		});
		BotaoDivisao.setBounds(122, 76, 89, 23);
		contentPane.add(BotaoDivisao);
	}
}
