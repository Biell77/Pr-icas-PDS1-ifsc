package Exercicio2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		
		ArrayList<String> Elementos = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			String numero = JOptionPane.showInputDialog("Insira os elementos");
			
			Elementos.add(numero);
		}
		
		JOptionPane.showMessageDialog(null, Elementos);

	}

}
