package exercicio1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Notebook extends Computador{
	  private double carregador, pasta;

	public Notebook() {
		super();
	}

	public Notebook(double placaMae, double hd, double memoria, double processador, double placaVideo, int volumes,
			int garantia, String configuracao, double carregador, double pasta) {
		super(placaMae, hd, memoria, processador, placaVideo, volumes, garantia, configuracao);
		this.carregador = carregador;
		this.pasta = pasta;
	}

	public double getCarregador() {
		return carregador;
	}

	public void setCarregador(double carregador) {
		this.carregador = carregador;
	}

	public double getPasta() {
		return pasta;
	}

	public void setPasta(double pasta) {
		this.pasta = pasta;
	}

	
	public double calculaPreco() {
		return this.getHd()
				+ this.getMemoria() 
				+ this.getPlacaMae() 
				+ this.getPlacaVideo() 
				+ this.getProcessador()
				+ this.getCarregador()
				+ this.getPasta();
	}
	
	DecimalFormat df = new DecimalFormat();	
	
	public void impressao() {
		JOptionPane.showMessageDialog(null, "Dados do notebook escolhido: \n\n"
				+ this.getConfiguracao() + "\n"
					+ "Valor total: R$ " + calculaPreco());
	}
	
	public void impressaoGarantia() {
		JOptionPane.showMessageDialog(null, "Dados do notebook escolhido: \n\n"
				+ this.getConfiguracao() + "\n"
					+ "Valor total: R$ " + df.format((calculaPreco() * 1.12)));
	}
	  
	
	  
}
