package view;

import controller.KanguroController;


public class Principal {
	

	public static void main(String[] args) {
		String[] names = {"Maria", "João", "José", "Tereza", "Carlos"};
		for(int i=0; i<5 ; i++){
			Thread kanguro = new KanguroController(30, names[i]);
			kanguro.start();
		}
		
	}

}
