package controller;

import br.com.jonas.Sorts;

public class SortsController {
	public SortsController() {
		super();
	}
	
	public void organiza(int[] vetor) {
		Sorts sort = new Sorts();
		
		int tamanho = vetor.length;
		
		double tempoInicial = System.nanoTime();
		sort.bubble(vetor, tamanho);
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10,9);
		System.out.println("O tempo gasto com bubble sort para organizar um vetor de " + tamanho + " foi de: " + tempoTotal + "s \n");
		
		tempoInicial = System.nanoTime();
		sort.merge(vetor, 0, tamanho-1);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10,9);
		System.out.println("O tempo gasto com merge sort para organizar um vetor de " + tamanho + " foi de: " + tempoTotal + "s \n");
		
		tempoInicial = System.nanoTime();
		sort.quick(vetor, 0, tamanho-1);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10,9);
		System.out.println("O tempo gasto com quick sort para organizar um vetor de " + tamanho + " foi de: " + tempoTotal + "s \n");
	}
}
