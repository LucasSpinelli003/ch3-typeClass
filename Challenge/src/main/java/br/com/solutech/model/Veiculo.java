package br.com.solutech.model;

public class Veiculo {
	private int id;
	private String modelo;	
	private double peso;
	private double altura;
	private double comprimento;
	private double largura;
	private int eixos;
	private String tipo_carroceria;
	private double pesoCarga;
	private String alteracoes;
	
	private Veiculo() {}

	public Veiculo(int id, String modelo, double peso, double altura, double comprimento, double largura, int eixos,
			String tipo_carroceria, double pesoCarga, String alteracoes) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.peso = peso;
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
		this.eixos = eixos;
		this.tipo_carroceria = tipo_carroceria;
		this.pesoCarga = pesoCarga;
		this.alteracoes = alteracoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public String getTipo_carroceria() {
		return tipo_carroceria;
	}

	public void setTipo_carroceria(String tipo_carroceria) {
		this.tipo_carroceria = tipo_carroceria;
	}

	public double getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(double pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	public String getAlteracoes() {
		return alteracoes;
	}

	public void setAlteracoes(String alteracoes) {
		this.alteracoes = alteracoes;
	}
	
	
	
}
