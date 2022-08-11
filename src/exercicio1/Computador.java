/*Exercício 1 - Lista 15 (Início - criação das classes e construção da interface gráfica com o Window Builder)

1 - Implemente uma classe computador (4 atributos).
a) Crie a classe notebook, e a classe desktop que herda características da classe
computador;
b) Para calcular o valor do computador é necessário levar em conta se é notebook
(carregador, pasta, etc.) ou desktop (estabilizador, teclado, etc), para isso implemente
métodos que ajudem na impressão da
Nota fiscal como:
Volumes: (Notebook) 1, (Desktop) 4;
Garantia: (Notebook) 1 ano, (Desktop) 2 anos; - Caso o cliente solicitar garantia estendida
acrescentar 1 ano;
Valor: O cliente pode escolher por uma placa de vídeo (off-board) ou não, caso opte pelo
modelo 1 acrescentar, 200,00 ao valor, modelo 2 acrescentar 400,00 e modelo 3 acrescentar
600,00. (Caso o cliente solicite garantia estendida acrescentar 12% ao valor se for notebook
e 10% se for desktop);
c) Ao final da configuração, imprimir as características do produto adquirido e valor total
do computador
*/


package exercicio1;

public class Computador {

	private double placaMae, hd, memoria, placaVideo, processador;
	private int volumes, garantia;
	private String configuracao;
	
	
	
	public Computador() {
	}

	public Computador(double placaMae, double hd, double memoria, double processador, double placaVideo, int volumes,
			int garantia, String configuracao) {
		super();
		this.placaMae = placaMae;
		this.hd = hd;
		this.memoria = memoria;
		this.processador = processador;
		this.placaVideo = placaVideo;
		this.volumes = volumes;
		this.garantia = garantia;
		this.configuracao = configuracao;
	}
	
	

	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public double getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(double placaMae) {
		this.placaMae = placaMae;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(double placaVideo) {
		this.placaVideo = placaVideo;
	}

	public int getVolumes() {
		return volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public String getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}
	
	public double calculaPreco() {
		return 0;
	}
	
	public void impressao() {

	}
	
	public void impressaoGarantia() {

	}
	
}
