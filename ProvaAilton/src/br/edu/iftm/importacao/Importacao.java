package br.edu.iftm.importacao;

import java.util.Scanner;

public class Importacao {
	Scanner entrada = new Scanner(System.in);
	private double valorProduto;
	private double cotacaoDolar;
	private double valorProdutoReais = 0.0;
	
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public double getCotacaoDolar() {
		return cotacaoDolar;
	}
	public void setCotacaoDolar(double cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}
	public double getValorProdutoReais() {
		return valorProdutoReais;
	}
	public void setValorProdutoReais(double valorProdutoReais) {
		this.valorProdutoReais = valorProdutoReais;
	}
	
	
	public void insercaoDeValores(){
		System.out.println("Insira o valor do produto em dólar:");
		valorProduto = entrada.nextDouble();
		
		System.out.println("Insira a cotação do dólar:");
		cotacaoDolar = entrada.nextDouble();
	}
		
	public double calculaValorProduto(){
		
		if(valorProduto < 50){
			return valorProduto * cotacaoDolar;
			
		}else{		
			return ((valorProduto * 0.6) + valorProduto) * cotacaoDolar;
		}
	}
	
	public void imprime(){
	    System.out.println("Valor em Reais: " + calculaValorProduto());
	    System.exit(0);
		   }
		
	
	}


	
	
	

