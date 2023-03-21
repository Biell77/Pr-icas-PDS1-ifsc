package Exercicio3;

import javax.swing.JOptionPane;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Double Nota1;
		Double Nota2;
		Double Nota3;
		
		Nota1 = Double.valueOf(JOptionPane.showInputDialog("Insira a primeira nota: "));
		Nota2 = Double.valueOf(JOptionPane.showInputDialog("Insira a segunda nota: "));
		Nota3 = Double.valueOf(JOptionPane.showInputDialog("Insira a terceira nota: "));
		
		JOptionPane.showMessageDialog(null, "Media Final: " +mediaf(Nota1, Nota2, Nota3));
		
			
		}

	private static Double mediaf(double Nota1, double Nota2, double Nota3) {
		Double MediaFinal = (Nota1 + Nota2 + Nota3)/3;
		
		if(MediaFinal >= 6) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		} if (MediaFinal >= 4) {
			JOptionPane.showMessageDialog(null, "Recuperação");
		} if(MediaFinal < 4) {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		return MediaFinal;
	}

}
