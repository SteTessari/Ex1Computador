package exercicio1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Desktop extends Computador{

	private double estabilizador, teclado;

	public Desktop() {

	}

	public Desktop(double placaMae, double estabilizador, double teclado, double hd, double processador, double memoria, double placaVideo, int volumes,
			int garantia, String configuracao) {
		super(placaMae, hd, processador, memoria, placaVideo, volumes, garantia, configuracao);
		this.estabilizador = estabilizador;
		this.teclado = teclado;
		
	}

	public double getEstabilizador() {
		return estabilizador;
	}

	public void setEstabilizador(double estabilizador) {
		this.estabilizador = estabilizador;
	}

	public double getTeclado() {
		return teclado;
	}

	public void setTeclado(double teclado) {
		this.teclado = teclado;
	}

	
	public double calculaPreco() {
		return this.getHd()
				+ this.getMemoria() 
				+ this.getPlacaMae() 
				+ this.getPlacaVideo() 
				+ this.getProcessador()
				+ this.getEstabilizador()
				+ this.getTeclado();
	}
	
	DecimalFormat df = new DecimalFormat();	
	
	public void impressao() {
		JOptionPane.showMessageDialog(null, "Dados do desktop escolhido:\n\n" 
				+ this.getConfiguracao() + "\n"
					+ "Valor total: R$" + calculaPreco());
	}
	
	public void impressaoGarantia() {
		JOptionPane.showMessageDialog(null, "Dados do desktop escolhido: \n\n"
				+ this.getConfiguracao() + "\n"
					+ "Valor total: R$ " + df.format((calculaPreco() * 1.10)));
	}
	 
	
	
	
}
