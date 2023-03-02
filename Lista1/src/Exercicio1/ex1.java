package Exercicio1;

import javax.swing.JOptionPane;

public class ex1 {
	
	public static void main(String[] args) {
	
	double PrecoLitro = 0;
	Integer QuantidadeLitros = null;
	
	PrecoLitro = Double.valueOf(JOptionPane.showInputDialog("Insira qual será o valor da gasolina"));
	QuantidadeLitros = Integer.valueOf(JOptionPane.showInputDialog("Insira a quantidade de gasolina"));
	
	JOptionPane.showMessageDialog(null, "O preço total é :" +CalculoTotal (QuantidadeLitros, PrecoLitro) );
	
	}
	
	public static Double CalculoTotal (Integer QuantidadeLitros, Double PrecoLitro) {
		
		Double TotalPagamento = QuantidadeLitros * PrecoLitro;
		return TotalPagamento;
	
	}
}
