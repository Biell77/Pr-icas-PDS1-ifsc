package Exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {

		ArrayList<String> elementos = new ArrayList();

		for (int i = 0; 1 < 10; i++) {
			String numero = JOptionPane.showInputDialog("Insira os elementos: ");

			elementos.add(numero);
		}
		
		  JOptionPane.showMessageDialog(null, elementos);
	}

}
