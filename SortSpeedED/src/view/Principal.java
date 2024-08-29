package view;

import controller.SortsController;

public class Principal {
	public static void main(String[] args) {
		SortsController sort = new SortsController();
		
		int[] vetor = new int[1500];
		
		for(int i = 0; i < 1500; i++) {
			vetor[i] = 1500-i;
		}
		
		sort.organiza(vetor);
	}
}
